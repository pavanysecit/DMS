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

public class WorkFlow_WorkStatusReport_SearchByInitiatedBy {
WebDriver driver;	
	
	@Given("^Admin module, Work status report page, initiated by drop down and view button$")
	public void Admin_module_Work_status_report_page_initiated_by_drop_down_and_view_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Select Initiated By and click on View button$")
	public void Select_Initiated_By_and_click_on_View_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    //Selecting the initiated by as mahesh from the drop down
	    WebElement st = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/div/select"));
	    Select se = new Select(st);
	    se.selectByVisibleText("Mahesh");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[11]")).getText();
	    String expectedvalue = "Mahesh";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	}

	@Then("^All the document which are initiated by the selected person in the drop down should get displayed$")
	public void All_the_document_which_are_initiated_by_the_selected_person_in_the_drop_down_should_get_displayed() throws Throwable {
	    //Selecting the initiated by as Pavan from the drop down
	    WebElement st1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/div/select"));
	    Select se1 = new Select(st1);
	    se1.selectByVisibleText("Pavan");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[11]")).getText();
	    String expectedvalue1 = "Pavan";
	    Assert.assertEquals(actualvalue1,expectedvalue1);
	    Thread.sleep(3000);
	    driver.quit();
	}
}