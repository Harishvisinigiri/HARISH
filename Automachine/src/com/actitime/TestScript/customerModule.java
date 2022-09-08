package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class customerModule extends BaseClass
{
	
	@Test
	public void createcustomer() {
	Reporter.log("createcustomer",true);
	}
	@Test(dependsOnMethods = "createcustomer")
	public void modifycustomer() {
	Reporter.log("modifycustomer",true);
	}
	@Test(dependsOnMethods = {"createcustomer","modifycustomer"})
	public void deletecustomer() {
	Reporter.log("deletecustomer",true);
	}
}
