package com.scripts.actitime;

import org.testng.annotations.Test;
import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeCreateNewCustomerPage;
import com.pages.actitime.ActitimeEditTypeofWork;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeSettingsPage;


public class TESTActitimeDeleteTypeofWork extends BaseTest
{
	@Test
	
	public void deletetypeofwork()
	{
		ActitimeHomePage settings=new ActitimeHomePage(driver);
		settings.settingsMethod();
		
		ActitimeSettingsPage typeofwork=new ActitimeSettingsPage(driver);
		typeofwork.clickonTypesworkmethod();
		
		ActitimeEditTypeofWork editdelete=new ActitimeEditTypeofWork(driver);
		editdelete.editdeletetypeofworkmethod();
		
		ActitimeCreateNewCustomerPage popup= new ActitimeCreateNewCustomerPage(driver);
		popup.okbuttonMethod();
		
	}

}
