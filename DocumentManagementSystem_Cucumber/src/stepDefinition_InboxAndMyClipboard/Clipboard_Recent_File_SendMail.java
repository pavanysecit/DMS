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

public class Clipboard_Recent_File_SendMail {
WebDriver driver;	
	
	@Given("^My Clipboard module module, checkbox to select the document, Mail link on the recents grid$")
	public void My_Clipboard_module_module_checkbox_to_select_the_document_Mail_link_on_the_recents_grid() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(3000);
	}

	@When("^Navigate to recents page, select the required file, click on mail link, provide the email ids and click on Send button$")
	public void Navigate_to_recents_page_select_the_required_file_click_on_mail_link_provide_the_email_ids_and_click_on_Send_button() throws Throwable {
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
	    
	    driver.findElement(By.id("chkSelect")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[2]/div[5]")).click();
	    Thread.sleep(2000);
	    
	    WebElement addr = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[2]/form/div[1]/div[2]/input"));
	    addr.sendKeys("pavan.kumar@ysecit.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[2]/form/div[1]/label/span[1]")).click();
	    Thread.sleep(2000);
	    WebElement cc = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[2]/form/div[2]/div[2]/input"));
	    cc.clear();
	    cc.sendKeys("mahesh.jutti@ysecit.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[2]/form/div[1]/label/span[2]")).click();
	    Thread.sleep(3000);
	    WebElement bcc = driver.findElement(By.id("inputEmail1"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(bcc);
	    actions.click();
	    actions.sendKeys("rama.subba@ysecit.com");
	    actions.build().perform();
	    Thread.sleep(2000);
	    
	    WebElement sbj =  driver.findElement(By.id("inputPassword1"));
	    sbj.sendKeys("Entering the subject line for the email");
	    Thread.sleep(2000);
	    
	    WebElement bdy =  driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[2]/form/div[5]/div/textarea"));
	    bdy.sendKeys("Entering Body content for the email");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[4]/div/div/div[2]/form/div[6]/div[1]/button")).click();   
	}

	@Then("^Email should sent to the respective email id successfully$")
	public void Email_should_sent_to_the_respective_email_id_successfully() throws Throwable {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Mail has been sent successfully.";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(3000);
		driver.quit();
	}
}