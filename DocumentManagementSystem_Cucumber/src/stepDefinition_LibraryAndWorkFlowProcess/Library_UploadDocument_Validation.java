package stepDefinition_LibraryAndWorkFlowProcess;

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

public class Library_UploadDocument_Validation {
WebDriver driver;	
	
	@Given("^Library module, Upload button and Save button$")
	public void Library_module_Upload_button_and_Save_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to Library page, click on upload link and click on Save button$")
	public void Navigate_to_Library_page_click_on_upload_link_and_click_on_Save_button() throws Throwable {
		driver.findElement(By.id("disabled")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div/div/div[3]/button[2]")).click();
	}

	@Then("^Validation message should be displayed if the user doesn't suploaded the document$")
	public void Validation_message_should_be_displayed_if_the_user_doesn_t_suploaded_the_document() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg2=driver.findElement(By.id("toast-container"));
		String text2=msg2.getText();
		String expectedText2 = "Please select a file before save.";
		Assert.assertEquals(text2,expectedText2);
		Thread.sleep(3000);
		driver.quit();
	}
}