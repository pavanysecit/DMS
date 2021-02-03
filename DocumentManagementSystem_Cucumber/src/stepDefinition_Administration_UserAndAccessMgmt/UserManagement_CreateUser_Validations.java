package stepDefinition_Administration_UserAndAccessMgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class UserManagement_CreateUser_Validations {
WebDriver driver;	
	
	@Given("^Admin module, user management section, user creation page and duplicate email id$")
	public void Admin_module_user_management_section_user_creation_page_and_duplicate_email_id() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on User management link, fill the user details with existing email id and click on save button$")
	public void Click_on_User_management_link_fill_the_user_details_with_existing_email_id_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[1]/div/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    
	    WebElement UN = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input"));
	    UN.sendKeys("Anvith1");
	    Thread.sleep(2000);
	    
	    WebElement EM = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[2]/input"));
	    EM.sendKeys("anvith1@gmail.com");
	    Thread.sleep(2000);
	    
	    // Selecting the country
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[4]/div/button/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[4]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input")).click();
	    
	    // Selecting the location
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[5]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[5]/div/div/ul/li[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input")).click();
	    
	    // Selecting the company
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[6]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[6]/div/div/ul/li")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input")).click();
	    
	    // Selecting the department
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[7]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[7]/div/div/ul/li[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input")).click();
	
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[9]")).click();
	}

	@Then("^User should not get created successfully and error messages should be displayed$")
	public void User_should_not_get_created_successfully_and_error_messages_should_be_displayed() throws Throwable {
		new WebDriverWait(driver, 6).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Email is already Used.You can use another Email.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}