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

public class WorkFlow_WorkStatusReport_SearchByDates {
WebDriver driver;	
	
	@Given("^Admin module, Work status report page, start date, due date and view button$")
	public void Admin_module_Work_status_report_page_start_date_due_date_and_view_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Select the start date & due date and click on View button$")
	public void Select_the_start_date_due_date_and_click_on_View_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/ul/li[2]/a")).click();
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
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	}

	@Then("^All the document which have same start date and due date should get displayed$")
	public void All_the_document_which_have_same_start_date_and_due_date_should_get_displayed() throws Throwable {
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[12]")).getText();
	    String expectedvalue = "09-10-2018";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	    
	    String actualvalue1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[13]")).getText();
	    String expectedvalue1 = "13-10-2018";
	    Assert.assertEquals(actualvalue1,expectedvalue1);
	    Thread.sleep(3000);
		driver.quit();
	}
}