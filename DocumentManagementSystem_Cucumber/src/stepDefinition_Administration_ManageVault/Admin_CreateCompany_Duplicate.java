package stepDefinition_Administration_ManageVault;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class Admin_CreateCompany_Duplicate {
WebDriver driver;	
	
	@Given("^admin module, company creation page and duplicate company details$")
	public void admin_module_company_creation_page_and_duplicate_company_details() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on add company link, fill the existing company details and click on save button$")
	public void Click_on_add_company_link_fill_the_existing_company_details_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[4]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[1]/div/div[1]/button/lable")).click();
	    Thread.sleep(2000);
	    
 
	    WebElement mySelectElement = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[1]/select"));
	    Select dropdown= new Select(mySelectElement);
	    dropdown.selectByIndex(1);
	    Thread.sleep(2000);
	    
	    WebElement loc = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[2]/select"));
	    Select dd= new Select(loc);
	    dd.selectByVisibleText("Electronic City");
	    Thread.sleep(2000);
	    
	    WebElement cm = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[3]/input"));
	    cm.clear();
	    cm.sendKeys("GWW");
	    Thread.sleep(2000);
	    
	    WebElement cd = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[4]/input"));
	    cd.clear();
	    cd.sendKeys("GWW");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/div[6]")).click(); 
	}

	@Then("^Company should not get created successfuylly and should display error message$")
	public void Company_should_not_get_created_successfuylly_and_should_display_error_message() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Company is already exist!";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(2000);
		driver.quit();
	}
}