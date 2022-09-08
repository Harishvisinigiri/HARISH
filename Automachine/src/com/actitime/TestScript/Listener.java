package com.actitime.TestScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

    public class Listener extends Basecase  implements ITestListener {
	static{
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	    }
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String res=result.getName();
    	TakesScreenshot t=(TakesScreenshot)driver;
        File src=t.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./ScreenShot/"+res+".png"); 
	    try {
			FileUtils.copyFile(src, dest);
		} 
	    catch (IOException e) {
			
		}
	    driver.close();
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	/*@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}
	@Override
	public void onStart(ITestContext context) {
		
	}
	@Override
	public void onFinish(ITestContext context) {
	
		}
*/	
}
