package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Library_File_AddAdditionalFields {
WebDriver driver;	
	
	@Given("^Library module, file link and additional fields link on the Library grid$")
	public void Library_module_file_link_and_additional_fields_link_on_the_Library_grid() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to Library page, click on file link and select the additional fields on the Library grid$")
	public void Navigate_to_Library_page_click_on_file_link_and_select_the_additional_fields_on_the_Library_grid() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/ul/li[6]/label/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/ul/li[7]/label/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/ul/li[8]/label/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/ul/li[9]/label/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/ul/li[10]/label/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/ul/li[11]/label/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[3]/ul/li[12]/label/input")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should add the additional fields on the Library grid and display the details for those fields$")
	public void System_should_add_the_additional_fields_on_the_Library_grid_and_display_the_details_for_those_fields() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/thead/tr/th[8]")).getText();
	    Assert.assertTrue(actual_value.contains("Created Date"));
	    Thread.sleep(1000);
	    
	    String actual_value1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/thead/tr/th[9]")).getText();
	    String expected_value1 = "CreatedBy";
	    Assert.assertEquals(actual_value1, expected_value1);
	    Thread.sleep(1000);
	    
	    String actual_value2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/thead/tr/th[10]")).getText();
	    Assert.assertTrue(actual_value2.contains("ModifiedBy"));
	    Thread.sleep(1000);
	    
	    String actual_value3 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/thead/tr/th[11]")).getText();
	    Assert.assertTrue(actual_value3.contains("Modified Date"));
	    Thread.sleep(2000);
	    driver.quit();
	}
}