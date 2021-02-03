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

public class Admin_CreateDepartment_SearchCriteria {
WebDriver driver;	
	
	@Given("^admin module, search text box and search button in department page$")
	public void admin_module_search_text_box_and_search_button_in_department_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to department page, enter the department name & code and click on search button$")
	public void Navigate_to_department_page_enter_the_department_name_code_and_click_on_search_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[5]/a")).click();
	    Thread.sleep(2000);
	    
	    //Entering the location name and clicking on search button
	    
	    WebElement name = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    name.sendKeys("Human Resource");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]")).getText();
	    String expected_value = "Human Resource";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    name.clear();
	}

	@Then("^System should check the entered department name & code and display the search results$")
	public void System_should_check_the_entered_department_name_code_and_display_the_search_results() throws Throwable {
	    //Entering the company code and clicking on search button
	    WebElement code = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    code.sendKeys("HR");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[3]/td[2]")).getText();
	    String expected_value2 = "HR";
	    Assert.assertEquals(actual_value2, expected_value2);
	    Thread.sleep(2000);
	    code.clear();
	    Thread.sleep(2000);
	    driver.quit();
	}
}