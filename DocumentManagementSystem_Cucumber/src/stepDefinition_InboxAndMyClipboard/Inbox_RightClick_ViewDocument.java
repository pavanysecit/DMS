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

public class Inbox_RightClick_ViewDocument {
WebDriver driver;	
	
	@Given("^Inbox module, Right click and View link$")
	public void Inbox_module_Right_click_and_View_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to Inbox page, right click on any document and click on View link$")
	public void Navigate_to_Inbox_page_right_click_on_any_document_and_click_on_View_link() throws Throwable {
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("grdpopup2")).click();
		Thread.sleep(5000);
	}

	@Then("^System should display the document content on the browser with read only access when user click on view link on the inbox page$")
	public void System_should_display_the_document_content_on_the_browser_with_read_only_access_when_user_click_on_view_link_on_the_inbox_page() throws Throwable {
	    driver.close();
	    Thread.sleep(2000);
	}
}