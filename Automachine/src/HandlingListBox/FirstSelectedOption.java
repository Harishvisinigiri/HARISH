package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/althi/Desktop/hotel.html");
		 WebElement checkPostListBox=driver.findElement(By.id("cp"));
		 Select s=new Select(checkPostListBox);
		 WebElement fsoption=s.getFirstSelectedOption();
		 String text=fsoption.getText();
		 System.out.println(text);
		 driver.close();
	}
}
