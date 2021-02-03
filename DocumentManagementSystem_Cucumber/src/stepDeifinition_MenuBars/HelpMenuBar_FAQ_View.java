package stepDeifinition_MenuBars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class HelpMenuBar_FAQ_View {
WebDriver driver;	
	
	@Given("^Help Menu controls and FAQ menu control$")
	public void Help_Menu_controls_and_FAQ_menu_control() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Help menu control and click on FAQ link$")
	public void Click_on_Help_menu_control_and_click_on_FAQ_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[5]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[5]/ul/li[1]")).click();
	    Thread.sleep(5000);
	}

	@Then("^System should display the updated FAQ's in the website$")
	public void System_should_display_the_updated_FAQ_s_in_the_website() throws Throwable {
	    driver.close();
	}
}