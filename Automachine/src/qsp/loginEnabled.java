package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginEnabled 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		boolean login=driver.findElement(By.name("login")).isEnabled();
		System.out.println(login);
		if(login==true)
		{
			System.out.println("login button is Enabled and pass");
		}
		else
		{
			System.out.println("login button is not Enabled and fail"); 
		}	
		driver.close();
	}

}
