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

public class Admin_AddingGroupRole_SearchCriteria {
WebDriver driver;	
	
	@Given("^Admin module, search text box and search button in group role page$")
	public void Admin_module_search_text_box_and_search_button_in_group_role_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to group role page, enter the group role name & comments and click on search button$")
	public void Navigate_to_group_role_page_enter_the_group_role_name_comments_and_click_on_search_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    //Entering the group role name and clicking on search button
	    
	    WebElement name = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    name.sendKeys("Super User");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]")).getText();
	    String expected_value = "Super User";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    name.clear();
	}

	@Then("^System should check the entered group role name & comment and display the search results$")
	public void System_should_check_the_entered_group_role_name_comment_and_display_the_search_results() throws Throwable {
		//Entering the company name and clicking on search button
	    WebElement comm = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    comm.sendKeys("This user will have");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]")).getText();
	    String expected_value1 = "This user will have all the rights";
	    Assert.assertEquals(actual_value1, expected_value1);
	    Thread.sleep(2000);
	    comm.clear();
	    Thread.sleep(2000);
	    driver.quit();
	}
}