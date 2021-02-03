package stepDefinition_Administration_UserAndAccessMgmt;

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
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class UserManagement_CreateUser_EditDetails {
WebDriver driver;	
	
	@Given("^Admin module, edit user details page$")
	public void Admin_module_edit_user_details_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on edit link, change user details and click on save button$")
	public void Click_on_edit_link_change_user_details_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[1]/div/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[2]/table/tbody/tr[7]/td[5]/i")).click();
	    Thread.sleep(2000);
	    
	    WebElement UN = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input"));
	    UN.clear();
	    UN.sendKeys("Anvitha");
	    Thread.sleep(2000);
	    
	    WebElement EM = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[2]/input"));
	    EM.clear();
	    EM.sendKeys("anvitha@gmail.com");
	    Thread.sleep(2000);
	    
	    // Selecting the country
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[4]/div/button/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("India")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input")).click();
	    
	    // Selecting the location
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[5]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[5]/div/div/ul/li[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input")).click();
	    
	    // Selecting the company
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[6]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[6]/div/div/ul/li")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input")).click();
	    
	    // Selecting the department
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[7]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[7]/div/div/ul/li[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[1]/input")).click();
	
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[3]/div[9]")).click();
	}

	@Then("^User details should get changed successfully$")
	public void User_details_should_get_changed_successfully() throws Throwable {
		new WebDriverWait(driver, 6).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "User Data Saved Successfully..";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}