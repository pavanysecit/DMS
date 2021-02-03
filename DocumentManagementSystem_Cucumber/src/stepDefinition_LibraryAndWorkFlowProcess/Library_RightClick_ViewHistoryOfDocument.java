package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Library_RightClick_ViewHistoryOfDocument {
WebDriver driver;	
	
	@Given("^Library module, Right click and View history link$")
	public void Library_module_Right_click_and_View_history_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/ul/li[7]/a")).click();
	    Thread.sleep(5000);
	}

	@When("^Navigate to library pages, right click on any document and click on View History link$")
	public void Navigate_to_library_pages_right_click_on_any_document_and_click_on_View_History_link() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("grdpopup8")).click();
		Thread.sleep(4000);
	}

	@Then("^System should display complete history of the document$")
	public void System_should_display_complete_history_of_the_document() throws Throwable {
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[3]/div/div/div[1]/h4")).getText();
	    String expectedvalue = "View History";
	    Assert.assertEquals(actualvalue, expectedvalue);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[3]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}
}