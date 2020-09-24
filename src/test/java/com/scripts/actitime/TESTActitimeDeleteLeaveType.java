package com.scripts.actitime;


import org.testng.annotations.Test;

import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeCreateNewCustomerPage;
import com.pages.actitime.ActitimeEditLeaveType;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLeaveType;


public class TESTActitimeDeleteLeaveType extends BaseTest {
	@Test
	public void deleteleavetype() throws InterruptedException
	{
		ActitimeHomePage settings=new ActitimeHomePage(driver);
		settings.settingsMethod();
		
		ActitimeLeaveType settingleave=new ActitimeLeaveType(driver);
		settingleave.ClickonLeaveTypesMethod();
		
		ActitimeEditLeaveType delete= new ActitimeEditLeaveType(driver);
		delete.Clickondeletebuttoneditmethod();
		
		ActitimeCreateNewCustomerPage popup= new ActitimeCreateNewCustomerPage(driver);
		popup.okbuttonMethod();
		
	}
	

}
