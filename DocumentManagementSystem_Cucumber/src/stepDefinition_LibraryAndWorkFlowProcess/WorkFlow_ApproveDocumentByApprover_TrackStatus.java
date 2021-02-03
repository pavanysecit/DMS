package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_Approver;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_ApproveDocumentByApprover_TrackStatus {
WebDriver driver;	
	
	@Given("^Approver login, My tasks under reviews & approval module, document and Track Status link$")
	public void Approver_login_My_tasks_under_reviews_approval_module_document_and_Track_Status_link() throws Throwable {
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

	@When("^Navigate to Reviews & Approval module as Approver, click on My tasks, right click on document and click on Track Status link$")
	public void Navigate_to_Reviews_Approval_module_as_Approver_click_on_My_tasks_right_click_on_document_and_click_on_Track_Status_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[9]/i")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should display track status of the document	when approver click on track status link$")
	public void System_should_display_track_status_of_the_document_when_approver_click_on_track_status_link() throws Throwable {
	    String actaulvalue = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/h3")).getText();
	    String expectedvalue = "Track Status";
	    Assert.assertEquals(actaulvalue, expectedvalue);
	    Thread.sleep(2000);
	    
	    String actaulvalue1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/label")).getText();
	    String expectedvalue1 = "Reviewed";
	    Assert.assertEquals(actaulvalue1, expectedvalue1);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}
}