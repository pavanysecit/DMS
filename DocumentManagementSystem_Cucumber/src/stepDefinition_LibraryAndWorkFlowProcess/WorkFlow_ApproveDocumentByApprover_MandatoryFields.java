package stepDefinition_LibraryAndWorkFlowProcess;

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
import stepDefinition_Login.DMS_Login_Approver;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_ApproveDocumentByApprover_MandatoryFields {
WebDriver driver;	
	
	@Given("^My tasks under reviews & approval module, document, submit approval button and submit button$")
	public void My_tasks_under_reviews_approval_module_document_submit_approval_button_and_submit_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_Approver(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[4]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[4]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to Reviews & Approval module, click on My tasks, right click on document, click on Submit Approval button and submit button$")
	public void Navigate_to_Reviews_Approval_module_click_on_My_tasks_right_click_on_document_click_on_Submit_Approval_button_and_submit_button() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("taskgrdpopup2")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[3]/button[1]")).click();
	}

	@Then("^Mandatory message should be displayed if the approver doesn't select the status and click on submit button$")
	public void Mandatory_message_should_be_displayed_if_the_approver_doesn_t_select_the_status_and_click_on_submit_button() throws Throwable {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Please Select Status";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}