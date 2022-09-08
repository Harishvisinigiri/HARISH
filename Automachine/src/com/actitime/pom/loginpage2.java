package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage2 {
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")              //declaration
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
	 public void setlogin1(String un,String pw) {
	    	untbx.sendKeys(un);                              //utilization
	    	pwtbx.sendKeys(pw);
	    	lgbtn.click();
	    }
}
