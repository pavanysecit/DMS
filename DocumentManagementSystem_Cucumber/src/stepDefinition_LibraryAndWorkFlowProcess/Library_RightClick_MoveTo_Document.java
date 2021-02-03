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

public class Library_RightClick_MoveTo_Document {
WebDriver driver;	
	
	@Given("^Library module, MoveTo link on right click and department folder$")
	public void Library_module_MoveTo_link_on_right_click_and_department_folder() throws Throwable {
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

	@When("^Navigate to Library page, right click and click on MoveTo link, right click on required department folder and click on paste link$")
	public void Navigate_to_Library_page_right_click_and_click_on_MoveTo_link_right_click_on_required_department_folder_and_click_on_paste_link() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("grdpopup1")).click();
		Thread.sleep(3000);
		
		Actions action1= new Actions(driver);
		WebElement data1= driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/ul/li[1]/a"));
		action1.contextClick(data1).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("menucont4")).click();
		Thread.sleep(3000);
	}

	@Then("^Document should get moved from one department to other department folder using right click MoveTo option$")
	public void Document_should_get_moved_from_one_department_to_other_department_folder_using_right_click_MoveTo_option() throws Throwable {
	    driver.quit();
	}
}