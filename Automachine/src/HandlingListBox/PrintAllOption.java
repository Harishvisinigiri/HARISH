package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/althi/Desktop/hotel.html"); 
		WebElement checkpostListbox=driver.findElement(By.id("cp"));
		Select s=new Select(checkpostListbox);
		List<WebElement> alloption=s.getOptions();
		for (WebElement i: alloption) 
		{
			String text = i.getText();
			System.out.println(text);
		}	
		driver.close();
	}
}
