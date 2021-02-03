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

public class UserManagement_CreateUser_SearchCriteria {
WebDriver driver;	
	
	@Given("^Admin module, search text box and search button in user page$")
	public void Admin_module_search_text_box_and_search_button_in_user_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to user page, enter the user name, group name & role and click on search button$")
	public void Navigate_to_user_page_enter_the_user_name_group_name_role_and_click_on_search_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    
	    WebElement grp = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    grp.sendKeys("admin");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]")).getText();
	    String expected_value = "(Admin)";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    grp.clear();
	}

	@Then("^System should check the entered user name, group name & role and display the search results$")
	public void System_should_check_the_entered_user_name_group_name_role_and_display_the_search_results() throws Throwable {
	    WebElement un = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    un.sendKeys("Pavan");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]")).getText();
	    String expected_value1 = "Pavan";
	    Assert.assertEquals(actual_value1, expected_value1);
	    Thread.sleep(2000);
	    un.clear();
	    
	    WebElement role = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    role.sendKeys("TL");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]")).getText();
	    String expected_value2 = "TL";
	    Assert.assertEquals(actual_value2, expected_value2);
	    Thread.sleep(2000);
	    role.clear();
	    Thread.sleep(2000);
	    driver.quit();
	}
}