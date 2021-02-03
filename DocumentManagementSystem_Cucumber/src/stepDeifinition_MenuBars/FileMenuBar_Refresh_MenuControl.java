package stepDeifinition_MenuBars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class FileMenuBar_Refresh_MenuControl {
WebDriver driver;	
	
	@Given("^Menu controls and refresh menu control$")
	public void Menu_controls_and_refresh_menu_control() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on File menu control and click on Refresh link$")
	public void Click_on_File_menu_control_and_click_on_Refresh_link() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/ul/li[3]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should refresh the current page and display the Dashboard page as it is the default page$")
	public void System_should_refresh_the_current_page_and_display_the_Dashboard_page_as_it_is_the_default_page() throws Throwable {
	    String actual = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div")).getText();
	    String expected = "Dashboard";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(3000);
	    driver.quit();
	}
}