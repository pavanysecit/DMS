package stepDeifinition_MenuBars;

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

public class FileMenuBar_UploadSameDocument_Validations {
WebDriver driver;	
	
	@Given("^Menu controls, Upload file link, document to upload and validation messages$")
	public void Menu_controls_Upload_file_link_document_to_upload_and_validation_messages() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Inbox, Click on File menu control, click on upload file link, select the document to upload and click on Save button$")
	public void Click_on_Inbox_Click_on_File_menu_control_click_on_upload_file_link_select_the_document_to_upload_and_click_on_Save_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    
		WebElement doc = driver.findElement(By.id("file"));
		doc.sendKeys("C:/Users/sw176/Downloads/PurchaseLogDetails.xls");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[6]/div/div/div[3]/button[2]")).click();
	}

	@Then("^System should display the validation message for uploading same document into the system$")
	public void System_should_display_the_validation_message_for_uploading_same_document_into_the_system() throws Throwable {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "This PurchaseLogDetails file is already exist!";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}