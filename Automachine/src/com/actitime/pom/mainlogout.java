package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mainlogout {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void main() throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.actitime.com/");
       loginPage l=new loginPage(driver);
       l.setuser("admin", "manager");
       Thread.sleep(3000);
       logoutpage h=new logoutpage(driver);
       h.setlogout();
       driver.close();
	 }
}
