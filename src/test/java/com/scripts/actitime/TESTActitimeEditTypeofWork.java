package com.scripts.actitime;



import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeEditTypeofWork;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeSettingsPage;
import com.pages.actitime.ActitimeTypeofWork;


public class TESTActitimeEditTypeofWork extends BaseTest{
	@Test
	public void edittypeofwork() throws InterruptedException, IOException
	{
		
		ActitimeHomePage settings=new ActitimeHomePage(driver);
		settings.settingsMethod();

		ActitimeSettingsPage typeofwork=new ActitimeSettingsPage(driver);
		typeofwork.clickonTypesworkmethod();

		ActitimeTypeofWork edit= new ActitimeTypeofWork(driver);
		edit.clickontypeofworkmethod();

		ActitimeEditTypeofWork newname=new ActitimeEditTypeofWork(driver);
		newname.edittypeofworknamemethod();
		newname.savechangesmethod();


	}

}



