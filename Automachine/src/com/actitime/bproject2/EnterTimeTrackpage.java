package com.actitime.bproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackpage 
{
	@FindBy(id="logoutLink")
	private WebElement lgout;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskTab;
	
	public EnterTimeTrackpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setTaskTab() {
		taskTab.click();
	}

	public void setLogout() {
		lgout.click();	
	}

}
