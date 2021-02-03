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

public class WorkFlow_WorkStatusReport_SearchByDocumentType {
WebDriver driver;	
	
	@Given("^Work status report page under under reviews & approval module, document type drop down and view button$")
	public void Work_status_report_page_under_under_reviews_approval_module_document_type_drop_down_and_view_button() throws Throwable {
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

	@When("^Select document type from the drop down and click on View button in work status report page$")
	public void Select_document_type_from_the_drop_down_and_click_on_View_button_in_work_status_report_page() throws Throwable {
	    //Selecting the document status as Identifications from the drop down
	    WebElement st = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[2]/div/div/select"));
	    Select se = new Select(st);
	    se.selectByVisibleText("Company license");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[7]")).getText();
	    String expectedvalue = "Company license";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	}

	@Then("^All the documents which has same selected document type in search criteria should get displayed$")
	public void All_the_documents_which_has_same_selected_document_type_in_search_criteria_should_get_displayed() throws Throwable {
	    //Selecting the document status as Agreements from the drop down
	    WebElement st = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[2]/div/div/select"));
	    Select se = new Select(st);
	    se.selectByVisibleText("Letters");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[6]/button[1]")).click();
	    Thread.sleep(3000);
	    
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div[1]/table/tbody/tr[1]/td[7]")).getText();
	    String expectedvalue = "Letters";
	    Assert.assertEquals(actualvalue,expectedvalue);
	    Thread.sleep(2000);
	    
	    driver.quit();
	}
}