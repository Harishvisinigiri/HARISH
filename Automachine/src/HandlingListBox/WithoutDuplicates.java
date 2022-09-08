package HandlingListBox;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/althi/Desktop/hotel.html");
	    WebElement mtrlistbox= driver.findElement(By.id("mtr"));
	    Select s=new Select(mtrlistbox);
		List<WebElement> option=s.getOptions();
		ArrayList<String> t3=new ArrayList<String>();

		for (int i=0;i<option.size();i++)
		{
			String text= option.get(i).getText();
		t3.add(text);
		}
		for (String k:t3)
		{
			System.out.println(k);
		}
		

	}

}
