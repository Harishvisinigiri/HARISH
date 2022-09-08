package com.actitime.cproject3;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.aproject1.Baseclass;
import com.actitime.bproject2.EnterTimeTrackpage;
import com.actitime.bproject2.TaskListpage;

public class Customermodule {
	@Listeners(com.actitime.aproject1.Listenerimplementation.class)
	public class CustomerModule extends Baseclass {

		@Test
		public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
			
			String customerName = f.getExcelData("CreateCustomer",2,2);
			String customerDescription = f.getExcelData("CreateCustomer", 2, 3);
			Reporter.log("CreateCustomer",true);
			EnterTimeTrackpage e=new EnterTimeTrackpage(driver);
			e.setTaskTab();
			TaskListpage t=new TaskListpage();
			t.getAddNewBtn().click();
			t.getNewCustOptions().click();
			t.getEnterCustNameTbx().sendKeys(customerName);
			t.getEnterCustDescTbx().sendKeys(customerDescription);
			t.getSelectCustDD().click();
			t.getOurCompany().click();
			t.getCreateCustBtn().click();
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer(), customerName));
			String actualCustText = t.getActualCustomer().getText();
			Assert.assertEquals(actualCustText, customerName);
		}
	}
}