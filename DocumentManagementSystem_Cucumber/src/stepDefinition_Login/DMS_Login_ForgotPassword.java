package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DMS_Login_ForgotPassword {
WebDriver driver;	
	
	@Given("^Login page, and forgot password link$")
	public void Login_page_and_forgot_password_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Click on forgot password link$")
	public void Click_on_forgot_password_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[3]/span/p/a")).click();
	    Thread.sleep(2000);
	    WebElement fg =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/input"));
	    fg.sendKeys("priya.shanmugam@ysecit.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should send the temporary password as email to mentioned email id$")
	public void System_should_send_the_temporary_password_as_email_to_mentioned_email_id() throws Throwable {
	    driver.quit();
	}
}