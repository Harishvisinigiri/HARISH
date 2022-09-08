package com.actitime.TestScript;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class veryfyActiAplication {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Reporter.log("Openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
	}
	@AfterMethod
	public void closeBrowser() {
		//Reporter.log("closeBrowser",true);
		driver.close();
	}
	@Test
	public void tilte() {
		String title=driver.getTitle();
		Reporter.log(title);
		//driver.close();
	}

}
