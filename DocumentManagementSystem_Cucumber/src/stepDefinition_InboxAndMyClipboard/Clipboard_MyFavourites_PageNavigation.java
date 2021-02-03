package stepDefinition_InboxAndMyClipboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Clipboard_MyFavourites_PageNavigation {
WebDriver driver;	
	
	@Given("^Admin module, next and last buttons in my favourities page$")
	public void Admin_module_next_and_last_buttons_in_my_favourities_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to my favourities pages and click on Next & Last buttons$")
	public void Navigate_to_my_favourities_pages_and_click_on_Next_Last_buttons() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[5]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/div/div/ul/li[1]/a")).click();
	    Thread.sleep(4000);
	}

	@Then("^System should navigate to different favourities pages when user clicks on next and back button$")
	public void System_should_navigate_to_different_favourities_pages_when_user_clicks_on_next_and_back_button() throws Throwable {
	    driver.quit();
	}
}