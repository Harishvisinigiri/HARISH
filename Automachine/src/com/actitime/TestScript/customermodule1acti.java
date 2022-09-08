package com.actitime.TestScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.TestScript.Listener.class)
public class customermodule1acti extends Basecase {
	//public class customermodule1acti extends Basecase {
		@Test
		public void createcustomer() throws InterruptedException  {
			Reporter.log("createcustomer",true);
			Thread.sleep(3000);
			Assert.fail();
		}
}
 