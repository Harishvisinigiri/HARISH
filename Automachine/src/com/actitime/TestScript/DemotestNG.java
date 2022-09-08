package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemotestNG 
{
	@Test
	public void CdemoTest() {
		Reporter.log("hi",true);
	}
	@Test
	public void Ademo() {
		Reporter.log("hello",true);
	}
	@Test
	public void Bdemo() {
		Reporter.log("how",true);
	}
}

