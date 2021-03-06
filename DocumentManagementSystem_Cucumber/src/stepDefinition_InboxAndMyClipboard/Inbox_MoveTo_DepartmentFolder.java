package stepDefinition_InboxAndMyClipboard;

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

public class Inbox_MoveTo_DepartmentFolder {
WebDriver driver;	
	
	@Given("^Inbox module, checkbox to select the document, MoveTo link on the Inbox grid and department folder$")
	public void Inbox_module_checkbox_to_select_the_document_MoveTo_link_on_the_Inbox_grid_and_department_folder() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to Inbox page, select the required file, click on MoveTo link, right click on required department folder and click on paste link$")
	public void Navigate_to_Inbox_page_select_the_required_file_click_on_MoveTo_link_right_click_on_required_department_folder_and_click_on_paste_link() throws Throwable {
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Document should get moved from Inbox to required department folder$")
	public void Document_should_get_moved_from_Inbox_to_required_department_folder() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(2000);
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[5]/ul/li[7]/a"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("menucont4")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}