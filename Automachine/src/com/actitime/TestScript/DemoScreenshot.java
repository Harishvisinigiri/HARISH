package com.actitime.TestScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoScreenshot 
{
	static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
    }   
        @Test
	    public void Testscreenshot() throws IOException {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.actitime.com/login.do");
    	TakesScreenshot t=(TakesScreenshot)driver;
        File src=t.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./ScreenShot/ss.png"); 
	    FileUtils.copyFile(src, dest);
	    driver.close();
    }
     
}