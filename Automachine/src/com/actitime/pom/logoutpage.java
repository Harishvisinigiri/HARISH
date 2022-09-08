package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {
	
	@FindBy(id="logoutLink")
	//@FindBy(xpath="//a[@class='logout']")
	private WebElement logtbx;
	
	public void loginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
    }
	public logoutpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setlogout() {
	logtbx.click();
	}
}
