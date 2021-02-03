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

public class AccessManagement_AddAccess_MandatoryFieldValidations {
WebDriver driver;	
	
	@Given("^Admin module, access management section, access creation page and mandatory field validation$")
	public void Admin_module_access_management_section_access_creation_page_and_mandatory_field_validation() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on Add button under access management page and click on save button$")
	public void Click_on_Add_button_under_access_management_page_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[4]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[1]/div/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]")).click();
	    Thread.sleep(2000); 
	}

	@Then("^System should display validation message for not entering the mandatory fields$")
	public void System_should_display_validation_message_for_not_entering_the_mandatory_fields() throws Throwable {
		String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/span/font")).getText();
		String expectedvalue = "Please Select User";
		Assert.assertEquals(actualvalue,expectedvalue);
		Thread.sleep(2000);
		driver.quit();
	}
}