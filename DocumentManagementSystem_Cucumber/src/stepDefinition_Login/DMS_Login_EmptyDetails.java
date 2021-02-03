package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DMS_Login_EmptyDetails {
WebDriver driver;	
	
	@Given("^Login page, empty username and empty password$")
	public void Login_page_empty_username_and_empty_password() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Dont enter the username and password and click on login button$")
	public void Dont_enter_the_username_and_password_and_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[3]/div/button")).click();
		Thread.sleep(2000);
	}

	@Then("^System should display the error message for not entering the username and password$")
	public void System_should_display_the_error_message_for_not_entering_the_username_and_password() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[4]/span")).getText();
		String expected_value = "Please Enter Email.";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[1]/input"));
		un.click();
		un.sendKeys("pavan.kumar@ysecit.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[3]/div/button")).click();
		Thread.sleep(2000);
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[4]/span")).getText();
		String expected_value1 = "Please Enter Password.";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(2000);
		driver.quit();
	}
}