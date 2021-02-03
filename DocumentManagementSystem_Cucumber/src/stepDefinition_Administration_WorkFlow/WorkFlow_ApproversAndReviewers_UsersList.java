package stepDefinition_Administration_WorkFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_ApproversAndReviewers_UsersList {
WebDriver driver;	
	
	@Given("^Admin module, workflow page and link to click on reviewer & approvers$")
	public void Admin_module_workflow_page_and_link_to_click_on_reviewer_approvers() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to workflow pages and click on reviewer & approvers link$")
	public void Navigate_to_workflow_pages_and_click_on_reviewer_approvers_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div/table/tbody/tr[6]/td[4]/i")).click();
	    Thread.sleep(2000);    
	}

	@Then("^System should display the reviewers list on click of reviewer icon$")
	public void System_should_display_the_reviewers_list_on_click_of_reviewer_icon() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/div[1]/h4")).getText();
	    String expected_value = "Reviewer Users";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/div[1]/button")).click();
	    Thread.sleep(2000); 
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div/table/tbody/tr[6]/td[5]/i")).click();
	    Thread.sleep(2000); 
	}

	@Then("^System should display the approvers list on click of approver icon$")
	public void System_should_display_the_approvers_list_on_click_of_approver_icon() throws Throwable {
	    String actual_value1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/div[1]/h4")).getText();
	    String expected_value1 = "Approver Users";
	    Assert.assertEquals(actual_value1, expected_value1);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/div[1]/button")).click();
	    Thread.sleep(2000); 
	    driver.quit();
	}
}