package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class Library_RightClick_RenameDocument {
WebDriver driver;	
	
	@Given("^Library module, Right click and Rename link$")
	public void Library_module_Right_click_and_Rename_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/ul/li[7]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to library pages, right click on any document, click on Rename link, change the document name and click on Rename butotn$")
	public void Navigate_to_library_pages_right_click_on_any_document_click_on_Rename_link_change_the_document_name_and_click_on_Rename_butotn() throws Throwable {
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("grdpopup3")).click();
		Thread.sleep(3000);
		
		//Clicking the mouse cursor at the end of the text
		WebElement moveelement = driver.findElement(By.id("DocumentName"));
		moveelement.click();
		moveelement.sendKeys(Keys.END);
		
		//Entering the suffix for the document title
		driver.findElement(By.id("DocumentName")).sendKeys("_Renamed");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[4]/div/div/div[3]/button[2]")).click();
	}

	@Then("^Document title should get changed as per the changes done by the user$")
	public void Document_title_should_get_changed_as_per_the_changes_done_by_the_user() throws Throwable {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Document name changed successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}