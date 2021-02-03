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

public class WorkFlow_WorkStatusReport_SearchByStatus {
WebDriver driver;
	
	@Given("^Work status report page under under reviews & approval module, status drop down and view button$")
	public void Work_status_report_page_under_under_reviews_approval_module_status_drop_down_and_view_button() throws Throwable {
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

	@When("^Select Status from the drop down and click on View button$")
	public void Select_Status_from_the_drop_down_and_click_on_View_button() throws Throwable {
	    //Selecting the document status as InProgress from the drop down
	    WebElement st = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select"));
	    Select se = new Select(st);
	    se.selectByVisibleText("In Progress");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[10]")).getText();
	    String expectedvalue = "In Progress";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	}

	@Then("^All the document which has same status selected in search criteria should get displayed$")
	public void All_the_document_which_has_same_status_selected_in_search_criteria_should_get_displayed() throws Throwable {
		//Selecting the document status as Approved from the drop down
		WebElement st1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select"));
	    Select se1 = new Select(st1);
	    se1.selectByVisibleText("Approved");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[10]")).getText();
	    String expectedvalue1 = "Approved";
	    Assert.assertEquals(actualvalue1,expectedvalue1);
	    Thread.sleep(2000);
	    
    
		//Selecting the document status as Pending from the drop down
		WebElement st3 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select"));
	    Select se3 = new Select(st3);
	    se3.selectByVisibleText("Rejected");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue3 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[10]")).getText();
	    String expectedvalue3 = "Rejected";
	    Assert.assertEquals(actualvalue3,expectedvalue3);
	    Thread.sleep(2000);
	    
		//Selecting the document status as Pending from the drop down
		WebElement st4 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select"));
	    Select se4 = new Select(st4);
	    se4.selectByVisibleText("Reassigned");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue4 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[10]")).getText();
	    String expectedvalue4 = "Reassigned";
	    Assert.assertEquals(actualvalue4,expectedvalue4);
	    Thread.sleep(3000);
	    
	    /*
		//Selecting the document status as Pending from the drop down
		WebElement st2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select"));
	    Select se2 = new Select(st2);
	    se2.selectByVisibleText("Pending");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[10]")).getText();
	    String expectedvalue2 = "Pending";
	    Assert.assertEquals(actualvalue2,expectedvalue2);
	    Thread.sleep(2000);
	    */
	    driver.quit();
	}
}