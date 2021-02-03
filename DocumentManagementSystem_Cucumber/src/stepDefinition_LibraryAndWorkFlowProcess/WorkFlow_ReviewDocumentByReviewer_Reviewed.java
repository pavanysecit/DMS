package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_ReviewDocumentByReviewer_Reviewed {
WebDriver driver;	
	
	@Given("^My tasks under reviews & approval module, document, Submit review button, status drop down, remarks and submit button$")
	public void My_tasks_under_reviews_approval_module_document_Submit_review_button_status_drop_down_remarks_and_submit_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[4]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[4]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to Reviews & Approval module, click on My tasks, right click on document, click on Submit Reviews, select the status, enter the remarks and click on submit button$")
	public void Navigate_to_Reviews_Approval_module_click_on_My_tasks_right_click_on_document_click_on_Submit_Reviews_select_the_status_enter_the_remarks_and_click_on_submit_button() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("taskgrdpopup1")).click();
		Thread.sleep(3000);
	}

	@Then("^Document should get reviewed and should go for further approval process$")
	public void Document_should_get_reviewed_and_should_go_for_further_approval_process() throws Throwable {
	    WebElement rev = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[2]/form/div[1]/div/textarea"));
	    rev.sendKeys("Reviewer has reviewed the document and sending for approval process");;
	    Thread.sleep(2000);
	    
	    WebElement status = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[2]/form/div[2]/div/select"));
	    Select dd= new Select(status);
	    dd.selectByVisibleText("Reviewed");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[3]/button[1]")).click();
	}

	@Then("^Document should be available in the Approvers my tasks list after review$")
	public void Document_should_be_available_in_the_Approvers_my_tasks_list_after_review() throws Throwable {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Data Saved successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}