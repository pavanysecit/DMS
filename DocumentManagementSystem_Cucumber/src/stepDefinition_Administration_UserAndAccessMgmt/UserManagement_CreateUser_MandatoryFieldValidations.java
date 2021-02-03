package stepDefinition_Administration_UserAndAccessMgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class UserManagement_CreateUser_MandatoryFieldValidations {
WebDriver driver;	
	
	@Given("^Admin module, user management section, user creation page and mandatory field validation$")
	public void Admin_module_user_management_section_user_creation_page_and_mandatory_field_validation() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on User management link and click on save button$")
	public void Click_on_User_management_link_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[1]/div/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[9]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display validation message for individula fields$")
	public void System_should_display_validation_message_for_individula_fields() throws Throwable {
		String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/span[1]")).getText();
		String expectedvalue = "Please Provide User Name";
		Assert.assertEquals(actualvalue,expectedvalue);
		
		String actualvalue1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/span[2]")).getText();
		String expectedvalue1 = "Please Provide EmailId";
		Assert.assertEquals(actualvalue1,expectedvalue1);
		
		String actualvalue2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/span[4]")).getText();
		String expectedvalue2 = "Please Select Country";
		Assert.assertEquals(actualvalue2,expectedvalue2);
		
		String actualvalue3 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/span[5]")).getText();
		String expectedvalue3 = "Please Select Location";
		Assert.assertEquals(actualvalue3,expectedvalue3);
		
		String actualvalue4 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/span[6]")).getText();
		String expectedvalue4 = "Please Select Company";
		Assert.assertEquals(actualvalue4,expectedvalue4);
		
		String actualvalue5 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/span[7]")).getText();
		String expectedvalue5 = "Please Select Department";
		Assert.assertEquals(actualvalue5,expectedvalue5);
		Thread.sleep(2000);
		driver.quit();
	}
}