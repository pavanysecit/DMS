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

public class Library_UploadDocument {
WebDriver driver;	
	
	@Given("^Library module, department folder, upload link and document to upload$")
	public void Library_module_department_folder_upload_link_and_document_to_upload() throws Throwable {
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

	@When("^Click on Library link, navigate to the department folder, click on upload link and select the document to upload$")
	public void Click_on_Library_link_navigate_to_the_department_folder_click_on_upload_link_and_select_the_document_to_upload() throws Throwable {
		driver.findElement(By.id("disabled")).click();
	    Thread.sleep(3000);
		
		WebElement doc = driver.findElement(By.id("image"));
		doc.sendKeys("C:/Users/sw176/Downloads/PurchaseLogDetails.xls");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div/div/div[3]/button[2]")).click();
	}

	@Then("^Document should get uploaded in the respective department folder and should be displayed in the list$")
	public void Document_should_get_uploaded_in_the_respective_department_folder_and_should_be_displayed_in_the_list() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "File has been uploaded sucessfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}