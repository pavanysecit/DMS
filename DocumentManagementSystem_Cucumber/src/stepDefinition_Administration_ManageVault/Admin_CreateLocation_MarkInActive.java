package stepDefinition_Administration_ManageVault;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class Admin_CreateLocation_MarkInActive {
WebDriver driver;	
	
	@Given("^admin module, edit location page and Inactive button$")
	public void admin_module_edit_location_page_and_Inactive_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on edit link, mark the location inactive and click on save button$")
	public void Click_on_edit_link_mark_the_location_inactive_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[3]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[2]/td[4]/i")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[4]/label[2]/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[5]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Location should be marked as Inactive and should not be listed in the location list$")
	public void Location_should_be_marked_as_Inactive_and_should_not_be_listed_in_the_location_list() throws Throwable {
	    driver.quit();
	}
}