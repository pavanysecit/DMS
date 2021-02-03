package stepDefinition_InboxAndMyClipboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Clipboard_Recent_File_EditDetails {
WebDriver driver;	
	
	@Given("^My Clipboard module module, edit link on the recents grid and checkbox to select the document$")
	public void My_Clipboard_module_edit_link_on_the_recents_grid_and_checkbox_to_select_the_document() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to recents page, select the required file, click on edit link, change the details and click on update button$")
	public void Navigate_to_recents_page_select_the_required_file_click_on_edit_link_change_the_details_and_click_on_update_button() throws Throwable {
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
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[6]")).click();
	    Thread.sleep(2000);
	    
	    WebElement mySelectElement = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div/div/div[2]/form/div[2]/div/select"));
	    Select dropdown= new Select(mySelectElement);
	    dropdown.selectByVisibleText("Letters");
	    Thread.sleep(2000);
	    WebElement mySelectElement1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div/div/div[2]/form/div[3]/div/select"));
	    Select dropdown1= new Select(mySelectElement1);
	    dropdown1.selectByVisibleText("Outgoing Letters");
	    Thread.sleep(2000);
	    WebElement comm =  driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div/div/div[2]/form/div[5]/div/textarea"));
	    comm.clear();
	    comm.sendKeys("Comments for the document");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div/div/div[3]/button[2]")).click();
	    Thread.sleep(4000);
	}

	@Then("^System should allow user to change the details and changes should get replected for that document$")
	public void System_should_allow_user_to_change_the_details_and_changes_should_get_replected_for_that_document() throws Throwable {
	    driver.quit();
	}
}