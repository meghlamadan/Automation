package com.scripts.actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLeaveType;



public class TESTActitimeCreateLeaveType extends BaseTest
{
	@Test
	public void createleavetype() throws InterruptedException, IOException
	{
		ActitimeHomePage settings=new ActitimeHomePage(driver);
		settings.settingsMethod();
		
		ActitimeLeaveType settingleave=new ActitimeLeaveType(driver);
		settingleave.ClickonLeaveTypesMethod();
		settingleave.ClickonCreateLeaveTypeMethod();
		settingleave.EnternameLeaveTypeMethod();
		settingleave.ClickonCreateLeaveType2Method();
		
		
		
	}

}
