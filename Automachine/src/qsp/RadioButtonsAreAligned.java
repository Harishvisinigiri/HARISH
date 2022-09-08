package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAreAligned 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		int fax = driver.findElement(By.name("sex")).getLocation().getX();
		int max= driver.findElement(By.name("sex")).getLocation().getX();
		int cax = driver.findElement(By.name("sex")).getLocation().getX();
		if(fax==max&&fax==cax&&max==cax)	{
			System.out.println("passed");
		}
		else {
			System.out.println("fail");
		}
		System.out.println(fax);
		System.out.println(max);
		System.out.println(cax);
		driver.close();
	}
}
