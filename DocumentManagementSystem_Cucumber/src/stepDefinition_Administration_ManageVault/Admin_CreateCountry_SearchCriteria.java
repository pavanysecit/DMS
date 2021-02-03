package stepDefinition_Administration_ManageVault;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class Admin_CreateCountry_SearchCriteria {
WebDriver driver;	
	
	@Given("^admin module, search text box and search button$")
	public void admin_module_search_text_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to country page, enter the country name & code and click on search button$")
	public void Navigate_to_country_page_enter_the_country_name_code_and_click_on_search_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    //Entering the country name and clicking on search button
	    
	    WebElement name = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    name.sendKeys("India");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[1]/div/div[2]/div/i")).click();
	    Thread.sleep(3000);
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]")).getText();
	    String expected_value = "India";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    name.clear();
	}

	@Then("^System should check the entered country name & code and display the search results$")
	public void System_should_check_the_entered_country_name_code_and_display_the_search_results() throws Throwable {
	    WebElement code = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    code.sendKeys("IND");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]")).getText();
	    String expected_value = "IND";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    code.clear();
	    driver.quit();
	}
}