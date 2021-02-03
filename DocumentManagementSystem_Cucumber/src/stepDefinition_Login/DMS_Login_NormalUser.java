package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DMS_Login_NormalUser {
	
	public DMS_Login_NormalUser (WebDriver driver) throws InterruptedException {
		
		WebElement un = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[1]/input"));
		un.click();
		un.sendKeys("mahesh.jutti@ysecit.com");
		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[2]/input"));
		pwd.click();
		pwd.sendKeys("abc@123");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[3]/div/button")).click();
		Thread.sleep(4000);
	}
}