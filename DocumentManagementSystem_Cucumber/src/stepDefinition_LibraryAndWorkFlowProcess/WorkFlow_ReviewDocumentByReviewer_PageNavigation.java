package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_ReviewDocumentByReviewer_PageNavigation {
WebDriver driver;	
	
	@Given("^My tasks under reviews & approval module, next and last buttons in reviewer workflow page$")
	public void My_tasks_under_reviews_approval_module_next_and_last_buttons_in_reviewer_workflow_page() throws Throwable {
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

	@When("^Navigate to Reviews & Approval module, click on My tasks and click on Next & Last buttons in reviewer workflow page$")
	public void Navigate_to_Reviews_Approval_module_click_on_My_tasks_and_click_on_Next_Last_buttons_in_reviewer_workflow_page() throws Throwable {
	    // clicking on next button then previous button, then last button and then first button
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[5]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should navigate to different pages when reviewer click on next button$")
	public void System_should_navigate_to_different_pages_when_reviewer_click_on_next_button() throws Throwable {
	    driver.quit();
	}
}