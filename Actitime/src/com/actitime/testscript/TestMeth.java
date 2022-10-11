package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actime.pom.EnterTimeTrackPage;
import com.actime.pom.TaskListPage;
import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class TestMeth extends BaseClass {

@Test
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException
{
	Reporter.log("pass",true);
	EnterTimeTrackPage t=new EnterTimeTrackPage(driver);
	t.getCreateTask().click();
	TaskListPage tp=new TaskListPage(driver);
	tp.getAddNewBtn().click();
	tp.getNewCustomerBtn().click();
	FileLib f=new FileLib();
	String custName = f.getExcelData("createCustomer", 1, 2);
	String custDesc = f.getExcelData("createCustomer", 1, 3);
	tp.getEnterCustomerNameTxtbox().sendKeys(custName);
	
	tp.getEnterCustomerDescriptionTxtbox().sendKeys(custDesc);
	tp.getSelectCustomerDropDownbox().click();
	tp.getOurCompanyOption().click();
	tp.getCreateCustomerBtn().click();
	Thread.sleep(3000);
	
}

}
