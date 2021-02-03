package stepDefinition_InboxAndMyClipboard;

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

public class Clipboard_Recent_CheckRecentDocuments {
WebDriver driver;

	@Given("^Admin module, recent section, right click, checked-out, check-in button$")
	public void Admin_module_recent_section_right_click_checked_out_check_in_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
	}
	
	@When("^Navigate to Inbox page, right click on any file, do check-out & check-in and navigate to recent section$")
	public void Navigate_to_Inbox_page_right_click_on_any_file_do_check_out_check_in_and_navigate_to_recent_section() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span"));
		action.contextClick(data).build().perform();
		driver.findElement(By.id("grdpopup4")).click();
		Thread.sleep(4000);
		Actions action1= new Actions(driver);
		WebElement data1= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span"));
		action1.contextClick(data1).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.id("grdpopup5")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	}
	
	@Then("^System should display all the documents which are checked-out recently by current user$")
	public void System_should_display_all_the_documents_which_are_checked_out_recently_by_current_user() throws Throwable {
	    String actual_value1 = driver.findElement(By.id("status")).getText();
	    Assert.assertTrue(actual_value1.contains("Checked-in"));
	    Thread.sleep(3000);
	    driver.quit();
	}
}