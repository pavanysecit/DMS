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

public class GlobalSearch_SearchByNameOrContent {
WebDriver driver;	
	
	@Given("^Gloabal search option, document name and content$")
	public void Gloabal_search_option_document_name_and_content() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Enter the document name or content and click on search icon$")
	public void Enter_the_document_name_or_content_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.id("search")).sendKeys("Harvest and Felling");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[3]/div/i")).click();
	    Thread.sleep(5000);
	}

	@Then("^Documents list should get displayed if the entered text matches with the document name or its content$")
	public void Documents_list_should_get_displayed_if_the_entered_text_matches_with_the_document_name_or_its_content() throws Throwable {
	    String actualString = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span")).getText();
	    Assert.assertTrue(actualString.contains("Harvest and Felling"));
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("search")).sendKeys("Inventory Payment");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[3]/div/i")).click();
	    Thread.sleep(5000);
	    
	    String actualString1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span")).getText();
	    Assert.assertTrue(actualString1.contains("GWW Issues"));
	    Thread.sleep(3000);
	    driver.quit();
	}
}