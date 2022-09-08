package HandlingListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandingListBox
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement MonthListBox =driver.findElement(By.id("month"));
		Select s=new Select(MonthListBox);
		s.selectByIndex(8);
		Thread.sleep(2000);
		s.selectByValue("2");
		Thread.sleep(6000);
		s.selectByVisibleText("Dec");
		driver.close();
	}
	
}
