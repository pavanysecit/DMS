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

public class FileMenuBar_UploadDocument {
WebDriver driver;	
	
	@Given("^Menu controls, Upload file link and document to upload$")
	public void Menu_controls_Upload_file_link_and_document_to_upload() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Inbox link, click on File menu control, click on upload file link, select the document to upload and click on Save button$")
	public void Click_on_Inbox_link_click_on_File_menu_control_click_on_upload_file_link_select_the_document_to_upload_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    
		WebElement doc = driver.findElement(By.id("file"));
		doc.sendKeys("C:/Users/sw176/Downloads/Exception Handling_V2.0.docx");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[6]/div/div/div[3]/button[2]")).click();
	}

	@Then("^Document should get uploaded in the inbox folder and should be displayed in the inbox$")
	public void Document_should_get_uploaded_in_the_inbox_folder_and_should_be_displayed_in_the_inbox() throws Throwable {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "File has been uploaded successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}