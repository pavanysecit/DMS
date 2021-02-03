package stepDefinition_InboxAndMyClipboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Inbox_PageNavigation {
WebDriver driver;	
	
	@Given("^Inbox module, next and last buttons in Inbox page$")
	public void Inbox_module_next_and_last_buttons_in_Inbox_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(4000);
	}

	@When("^Navigate to Inbox pages and click on Next & Last buttons$")
	public void Navigate_to_Inbox_pages_and_click_on_Next_Last_buttons() throws Throwable {
	    // clicking on next button then previous button, then last button and then first button
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[5]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should navigate to different Inbox pages when click on next button$")
	public void System_should_navigate_to_different_Inbox_pages_when_click_on_next_button() throws Throwable {
	    driver.quit();
	}
}