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

public class Admin_CreateCompany_SearchCriteria {
WebDriver driver;	
	
	@Given("^admin module, search text box and search button in company page$")
	public void admin_module_search_text_box_and_search_button_in_company_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to company page, enter the location name, company name & code and click on search button$")
	public void Navigate_to_company_page_enter_the_location_name_company_name_code_and_click_on_search_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[4]/a")).click();
	    Thread.sleep(2000);
	    
	    //Entering the location name and clicking on search button
	    
	    WebElement loc = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    loc.sendKeys("Cape Town");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]")).getText();
	    String expected_value = "Cape Town";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    loc.clear();
	}

	@Then("^System should check the entered location name, company name & code and display the search results$")
	public void System_should_check_the_entered_location_name_company_name_code_and_display_the_search_results() throws Throwable {
		//Entering the company name and clicking on search button
	    WebElement comn = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    comn.sendKeys("GWW");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]")).getText();
	    String expected_value1 = "GWW";
	    Assert.assertEquals(actual_value1, expected_value1);
	    Thread.sleep(2000);
	    comn.clear();
	    
	    //Entering the company code and clicking on search button
	    WebElement comc = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    comc.sendKeys("GWW SR");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[3]")).getText();
	    String expected_value2 = "GWW SR";
	    Assert.assertEquals(actual_value2, expected_value2);
	    Thread.sleep(2000);
	    comn.clear();
	    Thread.sleep(2000);
	    driver.quit();
	}
}