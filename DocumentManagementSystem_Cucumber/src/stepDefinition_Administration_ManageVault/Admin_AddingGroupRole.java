package stepDefinition_Administration_ManageVault;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class Admin_AddingGroupRole {
WebDriver driver;	
	
	@Given("^admin module, group role creation page and different controls for which access needs to be given$")
	public void admin_module_group_role_creation_page_and_different_controls_for_which_access_needs_to_be_given() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on add link in group role, fill the details, add the controls to the group and click on save button$")
	public void Click_on_add_link_in_group_role_fill_the_details_add_the_controls_to_the_group_and_click_on_save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[3]/div[2]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div[1]/div/div[1]/button")).click();
	    Thread.sleep(2000);
	    
	    WebElement GN = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[3]/input"));
	    GN.clear();
	    GN.sendKeys("Super User");
	    Thread.sleep(2000);
	    
	    WebElement cmm = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[4]/textarea"));
	    cmm.clear();
	    cmm.sendKeys("This user will have all the rights");
	    Thread.sleep(2000);
	    
	    //Selecting the menu bar
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/label[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[1]/ul/li[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[2]")).click();
	    Thread.sleep(2000);
	    
	    
	    //Selecting the Tool bar
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[6]/label[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[6]/div[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[6]/div[2]/i[2]")).click();
	    Thread.sleep(2000);		
	    
	    // Selecting the grid options
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[7]/label[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[7]/div[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[7]/div[2]/i[2]")).click();
	    Thread.sleep(2000);	
	    
	    // Selecting the customized grid view options
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[8]/label[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		element1.click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[8]/div[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[8]/div[2]/i[2]")).click();
	    Thread.sleep(2000);	
	    
	    // Selecting the folder access options
		WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[9]/div[1]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		element2.click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[9]/div[2]/ul/li[2]/input")).click();
	    Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[9]/div[2]/ul/li[6]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
		element3.click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[8]/div[2]/i[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Group role should get created successfuylly and should be visible in the group role list$")
	public void Group_role_should_get_created_successfuylly_and_should_be_visible_in_the_group_role_list() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[12]")).click();
	    
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		WebElement msg=driver.findElement(By.id("toast-container"));
		String text=msg.getText();
		String expectedText = "Data Saved Successfully..";
		Assert.assertEquals(text,expectedText);
		Thread.sleep(2000);
		driver.quit();
	}
}