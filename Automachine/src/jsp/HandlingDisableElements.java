package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisableElements {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/althi/Desktop/Disable.html");
			driver.findElement(By.id("d1")).sendKeys("admin");
			RemoteWebDriver r=(RemoteWebDriver)driver;
			r.executeScript("document.getElementById('d2').value='manager'");
	}

}
