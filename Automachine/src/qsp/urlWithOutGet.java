package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class urlWithOutGet
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(400);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(400);
		driver.navigate().back();
		Thread.sleep(200);
		driver.navigate().forward();
		Thread.sleep(200);
		driver.navigate().refresh();
		Thread.sleep(400);
		driver.close();
		System.out.println("passed");
	}

}
