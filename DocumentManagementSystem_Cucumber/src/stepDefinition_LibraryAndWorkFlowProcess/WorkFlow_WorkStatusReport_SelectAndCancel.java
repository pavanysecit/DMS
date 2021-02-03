package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_WorkStatusReport_SelectAndCancel {
WebDriver driver;	
	
	@Given("^Work status report page under under reviews & approval module and cancel button$")
	public void Work_status_report_page_under_under_reviews_approval_module_and_cancel_button() throws Throwable {
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

	@When("^Select the status,document type, start date & due date and click on Cancel button$")
	public void Select_the_status_document_type_start_date_due_date_and_click_on_Cancel_button() throws Throwable {
		//Selecting the document type as Identifications from the drop down
	    WebElement st = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[2]/div/div/select"));
	    Select se = new Select(st);
	    se.selectByVisibleText("Letters");
	    Thread.sleep(2000);
	    
	    //Selecting the document status as InProgress from the drop down
	    WebElement st1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select"));
	    Select se1 = new Select(st1);
	    se1.selectByVisibleText("In Progress");
	    Thread.sleep(2000);

	        
	    //Selecting start date and due date
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[10]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[5]/div/div/div/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[14]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[2]")).click();
	    Thread.sleep(3000);
	}

	@Then("^All the details selected in search criteria should get cleared on click on Cancel button in work status report page$")
	public void All_the_details_selected_in_search_criteria_should_get_cleared_on_click_on_Cancel_button_in_work_status_report_page() throws Throwable {
		String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select")).getText();
		Assert.assertTrue(actualvalue.contains("-Select Status-"));
		Thread.sleep(3000);
		driver.quit();
	}
}