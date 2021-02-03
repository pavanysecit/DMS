package stepDeifinition_MenuBars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class ViewMenuBar_FileDetails_ViewFileInformation {
WebDriver driver;	
	
	@Given("^View Menu controls, file details menu control and document to view the details$")
	public void View_Menu_controls_file_details_menu_control_and_document_to_view_the_details() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Inbox link, select the document checkbox, Click on View menu control and click on file details link$")
	public void Click_on_Inbox_link_select_the_document_checkbox_Click_on_View_menu_control_and_click_on_file_details_link() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/ul/li[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the file information about the selected document$")
	public void System_should_display_the_file_information_about_the_selected_document() throws Throwable {
	    String actual =  driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[7]/div/div/div[1]/h4")).getText();
	    String expected = "File Information";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[7]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}
}