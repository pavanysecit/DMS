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

public class Admin_AddingGroupRole_Duplicate {
WebDriver driver;	
	
	@Given("^Admin module, group role creation page and duplicate group role details$")
	public void Admin_module_group_role_creation_page_and_duplicate_group_role_details() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on add group role link, fill the existing group role details and click on save button$")
	public void Click_on_add_group_role_link_fill_the_existing_group_role_details_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[1]/div/div[1]/button")).click();
	    Thread.sleep(2000);
	    
	    WebElement GN = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[3]/input"));
	    GN.clear();
	    GN.sendKeys("Super User");
	    Thread.sleep(2000);
	    
	    WebElement cmm = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/textarea"));
	    cmm.clear();
	    cmm.sendKeys("This user will have all the rights");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[12]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Group role should not get created successfuylly and should display error message$")
	public void Group_role_should_not_get_created_successfuylly_and_should_display_error_message() throws Throwable { 
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Role is already exist";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(2000);
		driver.quit();
	}
}