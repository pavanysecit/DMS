package stepDefinition_Administration_WorkFlow;

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

public class WorkFlow_ApproversAndReviewers_Adding {
WebDriver driver;	
	
	@Given("^Admin module, Reviewers & Approvers page$")
	public void Admin_module_Reviewers_Approvers_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on reviewers & approvers link, fill the details and click on save button$")
	public void Click_on_reviewers_approvers_link_fill_the_details_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[11]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    //Selecting the document type, reviewers and approvers from the drop down
	    WebElement dt = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[1]/div/div/select"));
	    Select se = new Select(dt);
	    se.selectByVisibleText("Assets");
	    Thread.sleep(2000);
	    
	    WebElement rev = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[3]/div/table/tbody/tr/td[2]/div/select[1]"));
	    Select se1 = new Select(rev);
	    se1.selectByVisibleText("Priya");
	    Thread.sleep(2000);
	    
	    WebElement app = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[4]/div/table/tbody/tr/td[2]/div/select[1]"));
	    Select se2 = new Select(app);
	    se2.selectByVisibleText("Pavan");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/form/div[5]/button[1]")).click();
	}

	@Then("^Selected document type should get associated with reviewers and approvers$")
	public void Selected_document_type_should_get_associated_with_reviewers_and_approvers() throws Throwable {
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Data Saved successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}