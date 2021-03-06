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

public class FileMenuBar_UploadDocument_WithoutSelectingSourceFolder {
WebDriver driver;
	
	@Given("^Menu controls, Upload file link, document to upload and validation messages for not selecting source folder$")
	public void Menu_controls_Upload_file_link_document_to_upload_and_validation_messages_for_not_selecting_source_folder() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on File menu control, click on upload file link, select the document to upload and click on Save button$")
	public void Click_on_File_menu_control_click_on_upload_file_link_select_the_document_to_upload_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/ul/li[1]")).click();
	}

	@Then("^System should display the validation message while uploading the document without selecting the source folder$")
	public void System_should_display_the_validation_message_while_uploading_the_document_without_selecting_the_source_folder() throws Throwable {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Please Select Inbox or Library folder.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}