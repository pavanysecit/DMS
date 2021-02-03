package stepDefinition_LibraryAndWorkFlowProcess;

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

public class Library_Validations_NotSelectingDocument {
WebDriver driver;	
	
	@Given("^Library module, MoveTo, Edit, Remove and Mail link$")
	public void Library_module_MoveTo_Edit_Remove_and_Mail_link() throws Throwable {
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

	@When("^Navigate to Library page and click on MoveTo, Edit, Remove and Mail link$")
	public void Navigate_to_Library_page_and_click_on_MoveTo_Edit_Remove_and_Mail_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]")).click();
	    
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Please select file";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
	}

	@Then("^System should display the validation messages for not selecting the document checkbox$")
	public void System_should_display_the_validation_messages_for_not_selecting_the_document_checkbox() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[4]")).click();
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg1=driver.findElement(By.id("toast-container"));
		String text1=msg1.getText();
		String expectedText1 = "Please select file";
		Assert.assertEquals(text1,expectedText1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[5]")).click();
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg2=driver.findElement(By.id("toast-container"));
		String text2=msg2.getText();
		String expectedText2 = "Please select file";
		Assert.assertEquals(text2,expectedText2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[6]")).click();
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg3=driver.findElement(By.id("toast-container"));
		String text3=msg3.getText();
		String expectedText3 = "Please select file";
		Assert.assertEquals(text3,expectedText3);
		Thread.sleep(3000);
		
		driver.quit();
	}
}