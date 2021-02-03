package stepDefinition_Administration_WorkFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_ApproversAndReviewers_AddingAndRemoving {
WebDriver driver;
	
	@Given("^Admin module, Reviewers & Approvers page and Remove link$")
	public void Admin_module_Reviewers_Approvers_page_and_Remove_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on Add Reviewers & Add Approvers link and click on Remove link for individual users$")
	public void Click_on_Add_Reviewers_Add_Approvers_link_and_click_on_Remove_link_for_individual_users() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    // Clicking Add Reviewers link and clicking on x icon 
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[3]/button")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	}

	@Then("^Added approvers and reviewers should get removed$")
	public void Added_approvers_and_reviewers_should_get_removed() throws Throwable {
		
	    // Clicking Add Approvers link and clicking on x icon 
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[3]/button")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[2]/div[1]/label/i")).click();
	    Thread.sleep(2000);
	}
}