package stepDeifinition_MenuBars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class ViewMenuBar_ViewHistory_HistoryOfDocument_Validation {
WebDriver driver;	
	
	@Given("^View Menu controls, View History menu control and validation message$")
	public void View_Menu_controls_View_History_menu_control_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Inbox link, dont select the document checkbox, Click on View menu control and click on view history link$")
	public void Click_on_Inbox_link_dont_select_the_document_checkbox_Click_on_View_menu_control_and_click_on_view_history_link() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/button/lable")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/ul/li[3]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display validation message for not selecting the document checkbox and clicking on View History link$")
	public void System_should_display_validation_message_for_not_selecting_the_document_checkbox_and_clicking_on_View_History_link() throws Throwable {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Please select file";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}