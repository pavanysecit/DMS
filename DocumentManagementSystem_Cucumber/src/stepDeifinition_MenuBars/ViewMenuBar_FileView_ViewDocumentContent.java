package stepDeifinition_MenuBars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class ViewMenuBar_FileView_ViewDocumentContent {
WebDriver driver;	
	
	@Given("^View Menu controls, file view menu control and document to view$")
	public void View_Menu_controls_file_view_menu_control_and_document_to_view() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Inbox link, Click on View menu control and click on file view link$")
	public void Click_on_Inbox_link_Click_on_View_menu_control_and_click_on_file_view_link() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/ul/li[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the content of selected file in the browser with read-only access$")
	public void System_should_display_the_content_of_selected_file_in_the_browser_with_read_only_access() throws Throwable {
	    driver.close();
	}
}