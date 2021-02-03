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

public class Admin_CreateDocumentCategory_EditDetails {
WebDriver driver;	
	
	@Given("^admin module, edit document category page$")
	public void admin_module_edit_document_category_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on edit link, change document category details and click on save button$")
	public void Click_on_edit_link_change_document_category_details_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[2]/table/tbody/tr[4]/td[5]/i")).click();
	    Thread.sleep(2000);
	    
	    WebElement loc = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[4]/div[1]/select"));
	    Select dd= new Select(loc);
	    dd.selectByVisibleText("Social Documents");
	    Thread.sleep(2000);
	    
	    WebElement dtn = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[4]/div[3]/input"));
	    dtn.clear();
	    dtn.sendKeys("Employments");
	    Thread.sleep(2000);
	    
	    WebElement dtc = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[4]/div[2]/input"));
	    dtc.clear();
	    dtc.sendKeys("EMPL");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[4]/div[5]")).click();
	}

	@Then("^Document category details should get changed successfully$")
	public void Document_category_details_should_get_changed_successfully() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Data saved successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(2000);
		driver.quit();
	}
}