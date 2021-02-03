package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Library_RightClick_DownloadDocument {
WebDriver driver;	
	
	@Given("^Library module, Right click and Download link$")
	public void Library_module_Right_click_and_Download_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/ul/li[7]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to library pages, right click on any document and click on download link$")
	public void Navigate_to_library_pages_right_click_on_any_document_and_click_on_download_link() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("grdpopup7")).click();
		Thread.sleep(5000);
	}

	@Then("^Document should get downloaded into the user system$")
	public void Document_should_get_downloaded_into_the_user_system() throws Throwable {
	    driver.quit();
	}
}