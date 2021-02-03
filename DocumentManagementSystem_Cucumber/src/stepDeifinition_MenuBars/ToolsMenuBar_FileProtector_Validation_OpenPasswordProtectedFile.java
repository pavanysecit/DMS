package stepDeifinition_MenuBars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class ToolsMenuBar_FileProtector_Validation_OpenPasswordProtectedFile {
WebDriver driver;	
	
	@Given("^Tools menu controls, document, file protector link and invalid password$")
	public void Tools_menu_controls_document_file_protector_link_and_invalid_password() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Inbox, select the password protected document, click on edit link, enter the invalid password and click on Submit$")
	public void Click_on_Inbox_select_the_password_protected_document_click_on_edit_link_enter_the_invalid_password_and_click_on_Submit() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[6]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[5]/div/div/div[2]/div/input")).sendKeys("mahesh@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[5]/div/div/div[3]/button[1]")).click();
	    Thread.sleep(3000);
	}

	@Then("^Document edit form should not get opened if user enters the invalid password and should throw an error message$")
	public void Document_edit_form_should_not_get_opened_if_user_enters_the_invalid_password_and_should_throw_an_error_message() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Please check the password.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[5]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}