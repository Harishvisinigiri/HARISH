package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/althi/Desktop/mtr.html");
		WebElement mtrListBox=driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("dose");
		boolean status =s.isMultiple();
		s.selectByIndex(4);
		s.selectByValue("b");
		s.selectByVisibleText("idly");
	}

}
