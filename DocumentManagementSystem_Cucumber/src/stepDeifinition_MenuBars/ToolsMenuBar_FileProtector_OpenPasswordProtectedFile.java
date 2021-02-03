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

public class ToolsMenuBar_FileProtector_OpenPasswordProtectedFile {
WebDriver driver;	
	
	@Given("^Tools Menu controls, document, file protector link and password$")
	public void Tools_Menu_controls_document_file_protector_link_and_password() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Inbox, select the password protected document, click on edit link, enter the password and click on Submit$")
	public void Click_on_Inbox_select_the_password_protected_document_click_on_edit_link_enter_the_password_and_click_on_Submit() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[6]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[5]/div/div/div[2]/div/input")).sendKeys("pavan@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[5]/div/div/div[3]/button[1]")).click();
	    Thread.sleep(3000);
	}

	@Then("^Document edit form should get opened after entering the valid password$")
	public void Document_edit_form_should_get_opened_after_entering_the_valid_password() throws Throwable {
	    String actual = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div/div/div[1]/h4")).getText();
	    String expected = "Edit Information";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[3]/div/div/div[3]/button[1]")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}
}