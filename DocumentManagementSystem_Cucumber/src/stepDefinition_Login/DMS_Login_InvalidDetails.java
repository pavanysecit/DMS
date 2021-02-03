package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DMS_Login_InvalidDetails {
WebDriver driver;	
	
	@Given("^Login page, invalid username and invalid password$")
	public void Login_page_invalid_username_and_invalid_password() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Enter the invalid login details and click on login button$")
	public void Enter_the_invalid_login_details_and_click_on_login_button() throws Throwable {
		WebElement un = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[1]/input"));
		un.click();
		un.sendKeys("pavan.kumar@ysecit.com");
		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[2]/input"));
		pwd.click();
		pwd.sendKeys("test@321");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[3]/div/button")).click();
		Thread.sleep(2000);
	}

	@Then("^User should not be able to login and should get error message for entering invalid login details$")
	public void User_should_not_be_able_to_login_and_should_get_error_message_for_entering_invalid_login_details() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[4]/span")).getText();
		String expected_value = "Incorrect email or password.";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		driver.quit();
	}
}