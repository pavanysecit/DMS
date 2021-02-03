package stepDeifinition_MenuBars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class GlobalSearch_SearchByNameOrContent_Validation {
WebDriver driver;	
	
	@Given("^Gloabal search option, invalid document name and search icon$")
	public void Gloabal_search_option_invalid_document_name_and_search_icon() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Enter the invalid document name and click on search icon$")
	public void Enter_the_invalid_document_name_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.id("search")).sendKeys("search by invalid title");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[3]/div/i")).click();
	    Thread.sleep(5000);
	}

	@Then("^Document should not get displayed on the search list and it should display empty record text$")
	public void Document_should_not_get_displayed_on_the_search_list_and_it_should_display_empty_record_text() throws Throwable {
	    String actualString1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[1]/table/tbody/tr/td/b")).getText();
	    Assert.assertTrue(actualString1.contains("No Records Found"));
	    Thread.sleep(3000);
	    driver.quit();
	}
}