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

public class Library_RemoveDocument {
WebDriver driver;	
	
	@Given("^Library module, uploaded document and Remove link$")
	public void Library_module_uploaded_document_and_Remove_link() throws Throwable {
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

	@When("^Navigate to Library page, select the document and click on Remove link$")
	public void Navigate_to_Library_page_select_the_document_and_click_on_Remove_link() throws Throwable {
		driver.findElement(By.id("chkSelect")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[4]")).click();
	}

	@Then("^Uploaded document should get removed successfully and should not display in the Library list$")
	public void Uploaded_document_should_get_removed_successfully_and_should_not_display_in_the_Library_list() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Files has been removed successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}