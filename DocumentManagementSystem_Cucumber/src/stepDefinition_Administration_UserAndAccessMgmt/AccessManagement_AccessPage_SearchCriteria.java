package stepDefinition_Administration_UserAndAccessMgmt;

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

public class AccessManagement_AccessPage_SearchCriteria {
WebDriver driver;	
	
	@Given("^Admin module, search text box and search button in access page$")
	public void Admin_module_search_text_box_and_search_button_in_access_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to access page, enter the user name and click on search button$")
	public void Navigate_to_access_page_enter_the_user_name_and_click_on_search_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[4]/a/span[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should check the entered user name and display the search results$")
	public void System_should_check_the_entered_user_name_and_display_the_search_results() throws Throwable {
	    WebElement user = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    user.sendKeys("Priya");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).getText();
	    String expected_value2 = "Priya";
	    Assert.assertEquals(actual_value2, expected_value2);
	    Thread.sleep(2000);
	    user.clear();
	    Thread.sleep(2000);
	    driver.quit();
	}
}