package stepDefinition_Login;

import org.openqa.selenium.WebDriver;

public class DMS_URL {
	public DMS_URL(WebDriver driver) throws InterruptedException {
		 driver.get("http://192.168.248.240:8009/");
		 driver.manage().window().maximize();
	}
}