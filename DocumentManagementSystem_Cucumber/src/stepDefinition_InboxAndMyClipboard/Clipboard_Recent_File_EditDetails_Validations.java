package stepDefinition_InboxAndMyClipboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Clipboard_Recent_File_EditDetails_Validations {
WebDriver driver;	
	
	@Given("^My Clipboard module, edit link on the recents grid$")
	public void My_Clipboard_module_edit_link_on_the_recents_grid() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to recents page, dont select the file and click on edit link$")
	public void Navigate_to_recents_page_dont_select_the_file_and_click_on_edit_link() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span"));
		action.contextClick(data).build().perform();
		driver.findElement(By.id("grdpopup4")).click();
		Thread.sleep(4000);
		Actions action1= new Actions(driver);
		WebElement data1= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span"));
		action1.contextClick(data1).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.id("grdpopup5")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[6]")).click();
	}

	@Then("^System should display the validation message for not selecting the document and clicking on edit link$")
	public void System_should_display_the_validation_message_for_not_selecting_the_document_and_clicking_on_edit_link() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Please select file";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(4000);
		driver.quit();
	}
}