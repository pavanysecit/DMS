package stepDefinition_InboxAndMyClipboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Clipboard_MyFavourites_MarkDocumentFavourite {
WebDriver driver;	
	
	@Given("^My Clipboard module, my favourities section and favourities page$")
	public void My_Clipboard_module_my_favourities_section_and_favourities_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(4000);
	}

	@When("^Click on Inbox link, click on star icon on the document and navigate to the My favourite module$")
	public void Click_on_Inbox_link_click_on_star_icon_on_the_document_and_navigate_to_the_My_favourite_module() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]/i")).click();
	    Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/a")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display all the documents which are marked as favourite by current user$")
	public void System_should_display_all_the_documents_which_are_marked_as_favourite_by_current_user() throws Throwable {
		WebElement data = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span"));
		data.isDisplayed();
		Thread.sleep(2000);
		driver.quit();
	}
}