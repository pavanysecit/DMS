package stepDefinition_Administration_ManageVault;

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

public class Admin_CreateDepartment_EditDetails {
WebDriver driver;	
	
	@Given("^admin module, edit department page$")
	public void admin_module_edit_department_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on edit link, change department details and click on save button$")
	public void Click_on_edit_link_change_department_details_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[5]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/table/tbody/tr[4]/td[4]/i")).click();
	    Thread.sleep(2000);
	    
	    WebElement cm = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[1]/input"));
	    cm.clear();
	    cm.sendKeys("Sales and Marketting");
	    Thread.sleep(2000);
	    
	    WebElement cd = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[2]/input"));
	    cd.clear();
	    cd.sendKeys("SM");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[4]")).click();  
	}

	@Then("^Department details should get changed successfully$")
	public void Department_details_should_get_changed_successfully() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Department Updated successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(2000);
		driver.quit();
	}
}