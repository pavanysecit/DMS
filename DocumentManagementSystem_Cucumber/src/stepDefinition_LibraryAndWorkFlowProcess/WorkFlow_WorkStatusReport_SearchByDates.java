package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_WorkStatusReport_SearchByDates {
WebDriver driver;	
	
	@Given("^Work status report page under under reviews & approval module, start date, due date and view button$")
	public void Work_status_report_page_under_under_reviews_approval_module_start_date_due_date_and_view_button() throws Throwable {
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

	@When("^Select the start date & due date and click on View button in work status report page$")
	public void Select_the_start_date_due_date_and_click_on_View_button_in_work_status_report_page() throws Throwable {
	    //Selecting start date and due date
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[13]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[5]/div/div/div/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[17]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	}

	@Then("^All the documents which have same start date and due date should get displayed in work status report page$")
	public void All_the_documents_which_have_same_start_date_and_due_date_should_get_displayed_in_work_status_report_page() throws Throwable {
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[12]")).getText();
	    String expectedvalue = "09-11-2018";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	    
	    String actualvalue1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[13]")).getText();
	    String expectedvalue1 = "13-11-2018";
	    Assert.assertEquals(actualvalue1,expectedvalue1);
	    Thread.sleep(3000);
		driver.quit();
	}
}