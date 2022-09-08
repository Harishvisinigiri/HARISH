package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlternativelyMtrListBox 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{  
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/althi/Desktop/hotel.html");
	    WebElement mtrlistbox= driver.findElement(By.id("mtr"));
	    Select s=new Select(mtrlistbox);
		List<WebElement> allOptions=s.getOptions();
		int count=allOptions.size();
		for (int i=0;i<count;i++)
		{
			Thread.sleep(2000);
			s.selectByIndex(i);
			i=i+1;
		}
	}

}
