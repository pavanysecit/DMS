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

public class Admin_CreateDocumentType {
WebDriver driver;	
	
	@Given("^admin module, document type creation page$")
	public void admin_module_document_type_creation_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on add document type link, fill the details and click on save button$")
	public void Click_on_add_document_type_link_fill_the_details_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[1]/div[1]/div/div[1]/button")).click();
	    Thread.sleep(2000);
	       
	    WebElement dtn = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[4]/div[1]/input"));
	    dtn.clear();
	    dtn.sendKeys("Social Documents");
	    Thread.sleep(2000);
	    
	    WebElement dtc = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[4]/div[2]/input"));
	    dtc.clear();
	    dtc.sendKeys("SD");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[4]/div[4]")).click();  
	}

	@Then("^Document type should get created successfuylly and should be visible in the document type list$")
	public void Document_type_should_get_created_successfuylly_and_should_be_visible_in_the_document_type_list() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Data saved successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(2000);
		driver.quit();
	}
}