package HandlingListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourDateOfBirth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement DayListbox=driver.findElement(By.id("day"));
		Select s=new Select(DayListbox);
		Thread.sleep(2000);
		s.selectByIndex(23);
		
		WebElement MonthListbox=driver.findElement(By.id("month"));
		Select g=new Select(MonthListbox);
		Thread.sleep(2000);
		g.selectByValue("6");
		
		WebElement YearListbox=driver.findElement(By.id("year"));
		Select h=new Select(YearListbox);
		Thread.sleep(2000);
		h.selectByVisibleText("1999");
		driver.close();
		if(true) 
		{
			System.out.println("Dateof Birth is passed");
			System.out.println("24-06-1999");
		}
		else
		{
			System.out.println("Dateof Birth is failed");
		}
	}
}
