package com.scripts.actitime;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeEditLeaveType;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLeaveType;

public class TESTActitimeEditLeaveType extends BaseTest
{
	@Test
	public void editleavetype() throws AWTException, InterruptedException, IOException
	{
		ActitimeHomePage settings=new ActitimeHomePage(driver);
		settings.settingsMethod();
		
		ActitimeLeaveType settingleave=new ActitimeLeaveType(driver);
		settingleave.ClickonLeaveTypesMethod();
		
		
		ActitimeLeaveType edit=new ActitimeLeaveType(driver);
		edit.Clickoncreatedtypeofworkmethod();
		//edit.EditLeaveTypeMethod();
		
		ActitimeEditLeaveType newname=new ActitimeEditLeaveType(driver);
		newname.Editleavenametypemethod();
		newname.Clickonapplybuttonmethod();
		
		//settings.logoutMethod();
		
	}

}
