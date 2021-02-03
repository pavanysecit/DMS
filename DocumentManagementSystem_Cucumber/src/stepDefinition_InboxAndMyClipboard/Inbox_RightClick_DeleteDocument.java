package stepDefinition_InboxAndMyClipboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_NormalUser;
import stepDefinition_Login.DMS_URL;

public class Inbox_RightClick_DeleteDocument {
WebDriver driver;	
	
	@Given("^Inbox module, Right click and delete link$")
	public void Inbox_module_Right_click_and_delete_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to Inbox page, right click on any document and click on Delete link$")
	public void Navigate_to_Inbox_page_right_click_on_any_document_and_click_on_Delete_link() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]/span"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("grdpopup6")).click();
	}

	@Then("^Document should get deleted and confirmation message should be displayed in the inbox page$")
	public void Document_should_get_deleted_and_confirmation_message_should_be_displayed_in_the_inbox_page() throws Throwable {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Document has been deleted successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}