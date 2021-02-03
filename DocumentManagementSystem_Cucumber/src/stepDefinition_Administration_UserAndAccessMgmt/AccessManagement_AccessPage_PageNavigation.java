package stepDefinition_Administration_UserAndAccessMgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class AccessManagement_AccessPage_PageNavigation {
WebDriver driver;	
	
	@Given("^Admin module, next and last buttons in access page$")
	public void Admin_module_next_and_last_buttons_in_access_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to access pages and click on Next & Last buttons$")
	public void Navigate_to_access_pages_and_click_on_Next_Last_buttons() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[4]/a/span[2]")).click();
	    Thread.sleep(2000);
		
	    // clicking on next button then previous button, then last button and then first button
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/div/div/ul/li[5]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/div/div/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/div/div/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/div/div/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should navigate to different access pages when click on next button$")
	public void System_should_navigate_to_different_access_pages_when_click_on_next_button() throws Throwable {
		driver.quit();
	}
}