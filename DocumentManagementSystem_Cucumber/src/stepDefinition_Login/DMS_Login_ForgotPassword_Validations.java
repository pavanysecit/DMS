package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DMS_Login_ForgotPassword_Validations {
WebDriver driver;	
	
	@Given("^Login page, forgot password link and send verification email button$")
	public void Login_page_forgot_password_link_and_send_verification_email_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Click on forgot password link and enter invalid & empty email id$")
	public void Click_on_forgot_password_link_and_enter_invalid_empty_email_id() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[3]/span/p/a")).click();
	    Thread.sleep(2000);
	    WebElement emt =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/input"));
	    emt.sendKeys("testemail");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
		String actual_value = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/span")).getText();
		String expected_value = "Please Enter Valid Email.";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		emt.clear();
	}

	@Then("^System should throw an error message for entering invalid and empty email id$")
	public void System_should_throw_an_error_message_for_entering_invalid_and_empty_email_id() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
		String actual_value = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/span")).getText();
		String expected_value = "Please Enter Email.";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}