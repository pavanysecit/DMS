package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DMS_Logout {
	
	public DMS_Logout (WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/i[2]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}