package com.scripts.actitime;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeEditCustomer;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeTasksPage;

public class TESTActitimeEditCustomer extends BaseTest{
	@Test
	public void editcustomer() throws IOException, InterruptedException, AWTException
	{
		ActitimeHomePage home= new ActitimeHomePage(driver);
		home.tasksMethod();
		
		ActitimeTasksPage edit=new ActitimeTasksPage(driver);
		edit.searchmethod();
		
		ActitimeEditCustomer editbutton=new ActitimeEditCustomer(driver);
		editbutton.editcustomerbuttonmethod();
		editbutton.settingiconmethod();
		editbutton.clickonnamelabelmethod();
		
	}

}
