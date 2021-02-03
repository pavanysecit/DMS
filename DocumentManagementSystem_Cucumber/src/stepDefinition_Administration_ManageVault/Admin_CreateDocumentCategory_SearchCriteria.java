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

public class Admin_CreateDocumentCategory_SearchCriteria {
WebDriver driver;	
	
	@Given("^admin module, search text box and search button in document category page$")
	public void admin_module_search_text_box_and_search_button_in_document_category_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to document category page, enter the document category name & code, document type and click on search button$")
	public void Navigate_to_document_category_page_enter_the_document_category_name_code_document_type_and_click_on_search_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[7]/a")).click();
	    Thread.sleep(2000);
	    
	    //Entering the document type and clicking on search button
	    
	    WebElement type = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    type.sendKeys("Agreements");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]")).getText();
	    String expected_value = "Agreements";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    type.clear();
	}

	@Then("^System should check the entered document category name & code, document type and display the search results$")
	public void System_should_check_the_entered_document_category_name_code_document_type_and_display_the_search_results() throws Throwable {
		
		//Entering the document category code and clicking on search button
	    WebElement dtc = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    dtc.sendKeys("SDs");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[2]/table/tbody/tr/td[2]")).getText();
	    String expected_value2 = "SDs";
	    Assert.assertEquals(actual_value2, expected_value2);
	    Thread.sleep(2000);
	    dtc.clear();
	    Thread.sleep(2000);
	    
		//Entering the document category name and clicking on search button
	    WebElement dcn = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div[2]/div[1]/input"));
	    dcn.sendKeys("Social Docs");
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
	    Thread.sleep(3000);
	    String actual_value1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[2]/table/tbody/tr/td[1]")).getText();
	    String expected_value1 = "Social Docs";
	    Assert.assertEquals(actual_value1, expected_value1);
	    Thread.sleep(2000);
	    dcn.clear();
	    Thread.sleep(3000);
	    driver.quit();
	}
}