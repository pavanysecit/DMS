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

public class FileMenuBar_LogOut_MenuControl {
WebDriver driver;	
	
	@Given("^Menu controls and LogOut menu control$")
	public void Menu_controls_and_LogOut_menu_control() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on File menu control and click on LogOut link$")
	public void Click_on_File_menu_control_and_click_on_LogOut_link() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/ul/li[4]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should logout from current session and should navigate to the login page$")
	public void System_should_logout_from_current_session_and_should_navigate_to_the_login_page() throws Throwable {
	    String actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/span[2]")).getText();
	    String expected = "Welcome";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(3000);
	    driver.quit();
	}
}