package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Testclass1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		@Test
		public void demoTestclass() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			loginpage2 l=new loginpage2();
			PageFactory.initElements(driver, l);
			l.setlogin1("admin", "manager");
		}
}
