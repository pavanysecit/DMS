package stepDefinition_InboxAndMyClipboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Clipboard_MyFavourites_RemoveDocumentFromFavouriteList {
WebDriver driver;	
	
	@Given("^My Clipboard module, my favourities section, favourities page and star icon$")
	public void My_Clipboard_module_my_favourities_section_favourities_page_and_star_icon() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on Inbox link, navigate to the My favourite module and click on star icon on the document$")
	public void Click_on_Inbox_link_navigate_to_the_My_favourite_module_and_click_on_star_icon_on_the_document() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]/i")).click();
	    Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/a")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr/td[2]/i")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should remove the document from the favourite list after clicking on star icon$")
	public void System_should_remove_the_document_from_the_favourite_list_after_clicking_on_star_icon() throws Throwable {
	    driver.quit();
	}
}