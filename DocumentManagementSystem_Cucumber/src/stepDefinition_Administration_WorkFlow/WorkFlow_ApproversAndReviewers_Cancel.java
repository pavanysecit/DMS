package stepDefinition_Administration_WorkFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_ApproversAndReviewers_Cancel {
WebDriver driver;	
	
	@Given("^Admin module, Reviewers & Approvers page and Cancel button$")
	public void Admin_module_Reviewers_Approvers_page_and_Cancel_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Select document type, reviewers and approvers and click on Cancel button$")
	public void Select_document_type_reviewers_and_approvers_and_click_on_Cancel_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    //Selecting the document type, reviewers and approvers from the drop down
	    WebElement dt = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select"));
	    Select se = new Select(dt);
	    se.selectByVisibleText("Assets");
	    Thread.sleep(2000);
	    
	    WebElement rev = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[2]/div/select[1]"));
	    Select se1 = new Select(rev);
	    se1.selectByVisibleText("Priya");
	    Thread.sleep(2000);
	    
	    WebElement app = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[2]/div/select[1]"));
	    Select se2 = new Select(app);
	    se2.selectByVisibleText("Pavan");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[5]/button[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Selected details should be cleared on click of Cancel button$")
	public void Selected_details_should_be_cleared_on_click_of_Cancel_button() throws Throwable {
		String actualvalue =driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[2]/div/select[1]")).getText();
		Assert.assertTrue(actualvalue.contains("--Select Reviewer--"));
		Thread.sleep(3000);
		driver.quit();
	}
}