package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")              //declaration
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
    public Loginpage1(WebDriver driver) {
    	PageFactory.initElements(driver, this);        //initialization
    }
    
    public void setlogin1(String un,String pw) {
    	untbx.sendKeys(un);                              //utilization
    	pwtbx.sendKeys(pw);
    	lgbtn.click();
    }
}
