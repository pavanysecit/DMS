package stepDefinition_Administration_ManageVault;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.DMS_Login;
import stepDefinition_Login.DMS_URL;

public class Admin_AddingGroupRole_ClickDownAndUpArrows {
WebDriver driver;
	
	@Given("^Admin module, group role creation page and down & Up arrows$")
	public void Admin_module_group_role_creation_page_and_down_Up_arrows() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new DMS_URL(driver);
	    Thread.sleep(2000);
	    new DMS_Login(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/button/lable")).click();
	    Thread.sleep(3000);
	}

	@When("^Click on add link in group role, fill the details, select the controls and click on Down and Up arrows$")
	public void Click_on_add_link_in_group_role_fill_the_details_select_the_controls_and_click_on_Down_and_Up_arrows() throws Throwable {
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
	}

	@Then("^Controls should get added to below list when user select the control and click on Down arrow$")
	public void Controls_should_get_added_to_below_list_when_user_select_the_control_and_click_on_Down_arrow() throws Throwable {
	    //Selecting the menu controls and clicking Down arrow
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/label[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[1]/ul/li[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[1]/ul/li[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[1]/ul/li[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[1]/ul/li[1]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Controls should get removed from the below list when user select the controls and click on Up arrow$")
	public void Controls_should_get_removed_from_the_below_list_when_user_select_the_controls_and_click_on_Up_arrow() throws Throwable {
		//Selecting the menu controls and clicking Up arrow
		driver.findElement(By.xpath("html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[3]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[1]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[3]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[1]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[3]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[1]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[3]/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[2]/div[5]/div[2]/i[1]")).click();
	    Thread.sleep(3000);
	    driver.quit();
	}
}