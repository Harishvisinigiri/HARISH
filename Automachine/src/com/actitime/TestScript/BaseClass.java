package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Openbrowser",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Closebrowsare",true);
	}
	@BeforeMethod
	public void Login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}

}
