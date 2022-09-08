package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testclass {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void demoTestclass() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Loginpage1 l=new Loginpage1(driver);
		l.setlogin1("admin", "manager");
	}
	

}
