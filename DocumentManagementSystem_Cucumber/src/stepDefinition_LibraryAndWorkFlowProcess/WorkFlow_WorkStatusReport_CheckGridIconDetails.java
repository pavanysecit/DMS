package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_WorkStatusReport_CheckGridIconDetails {
WebDriver driver;	
	
	@Given("^Work status report page under under reviews & approval module, view button, approver, reviewer and track status link$")
	public void Work_status_report_page_under_under_reviews_approval_module_view_button_approver_reviewer_and_track_status_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[4]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[4]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to search workflow status page and click on approver, reviewer and track status link$")
	public void Navigate_to_search_workflow_status_page_and_click_on_approver_reviewer_and_track_status_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display reviewers list in pop-up on click of Reviewers icon$")
	public void System_should_display_reviewers_list_in_pop_up_on_click_of_Reviewers_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[14]/i")).click();
	    Thread.sleep(2000);
		String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/div[1]/h4")).getText();
	    String expectedvalue = "Reviewer List";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/div[1]/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the approvers list in pop-up  on click of approvers icon$")
	public void System_should_display_the_approvers_list_in_pop_up_on_click_of_approvers_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[15]/i")).click();
	    Thread.sleep(2000);
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/div[1]/h4")).getText();
	    String expectedvalue = "Approver List";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/div[1]/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the track status details in pop-up on click of Track status icon$")
	public void System_should_display_the_track_status_details_in_pop_up_on_click_of_Track_status_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[16]/i")).click();
	    Thread.sleep(2000);
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/h3")).getText();
	    String expectedvalue = "Track Status";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	    
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		element.click();
		Thread.sleep(3000);
		driver.quit();
	}
}