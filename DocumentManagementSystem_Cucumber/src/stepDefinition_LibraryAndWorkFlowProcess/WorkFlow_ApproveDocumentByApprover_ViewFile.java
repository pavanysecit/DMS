package stepDefinition_LibraryAndWorkFlowProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login_Approver;
import stepDefinition_Login.DMS_URL;

public class WorkFlow_ApproveDocumentByApprover_ViewFile {
WebDriver driver;
	
	@Given("^Approver login, My tasks under reviews & approval module, document and View File link$")
	public void Approver_login_My_tasks_under_reviews_approval_module_document_and_View_File_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_Approver(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[4]/a/span[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[4]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^Login as Approver, Navigate to Reviews & Approval module, click on My tasks, right click on document and click on View File link$")
	public void Login_as_Approver_Navigate_to_Reviews_Approval_module_click_on_My_tasks_right_click_on_document_and_click_on_View_File_link() throws Throwable {
		Actions action= new Actions(driver);
		WebElement data= driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		action.contextClick(data).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("taskgrdpopup3")).click();
		Thread.sleep(5000);
	}

	@Then("^Document content should get opened in browser with read only access for approver$")
	public void Document_content_should_get_opened_in_browser_with_read_only_access_for_approver() throws Throwable {
		driver.close();
	}
}