package stepDefinition_InboxAndMyClipboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Inbox_UploadDocument {
WebDriver driver;	
	
	@Given("^Inbox module, Upload document link and document to upload$")
	public void Inbox_module_Upload_document_link_and_document_to_upload() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(4000);
	}

	@When("^Navigate to inbox page, click on upload link, select the document from the system and click on Save button$")
	public void Navigate_to_inbox_page_click_on_upload_link_select_the_document_from_the_system_and_click_on_Save_button() throws Throwable {
		driver.findElement(By.id("disabled")).click();
	    Thread.sleep(3000);
		
		WebElement doc = driver.findElement(By.id("image"));
		doc.sendKeys("C:/Users/sw176/Downloads/PurchaseLogDetails.xls");
	    Thread.sleep(2000);
	    
	    /*
	    WebElement mySelectElement = driver.findElement(By.id("type"));
	    Select dropdown= new Select(mySelectElement);
	    dropdown.selectByVisibleText("Letters");
	    Thread.sleep(2000);
	    
	    WebElement mySelectElement1 = driver.findElement(By.id("category"));
	    Select dropdown1= new Select(mySelectElement1);
	    dropdown1.selectByVisibleText("Outgoing Letters");
	    Thread.sleep(2000);
	    
	    WebElement comm =  driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div/div/div[2]/form/div[4]/div/textarea"));
	    comm.clear();
	    comm.sendKeys("Comments for the document");
	    */
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div/div/div[3]/button[2]")).click();
	}

	@Then("^Document should get upload successfully and should be visible in the inbox$")
	public void Document_should_get_upload_successfully_and_should_be_visible_in_the_inbox() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "File has been uploaded sucessfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(5000);
		driver.quit();
	}
}