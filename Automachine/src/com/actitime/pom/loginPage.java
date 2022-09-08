package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement lgbtx;
	
	public loginPage(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtx=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setuser(String un,String pw) {
		untbx.sendKeys(un);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		pwtbx.sendKeys(pw);
		lgbtx.click();
	}

}
