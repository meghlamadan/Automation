package com.scripts.actitime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeCreateNewTypeofWorkPage;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeSettingsPage;
import com.pages.actitime.ActitimeTypeofWork;



public class TESTActitimeCreateTypeofWork extends BaseTest
{
	
@Test
public void createtypeofwork() throws IOException
{
	
	
	ActitimeHomePage settings=new ActitimeHomePage(driver);
	settings.settingsMethod();
	
	ActitimeSettingsPage typeofwork=new ActitimeSettingsPage(driver);
	typeofwork.clickonTypesworkmethod();
	
	ActitimeTypeofWork createtypeofwork=new ActitimeTypeofWork(driver);
	createtypeofwork.clickoncreatetypeofworkmethod();
	
	ActitimeCreateNewTypeofWorkPage entertypeofwork=new ActitimeCreateNewTypeofWorkPage(driver);
	entertypeofwork.Enternewtypenmaemethod();
	entertypeofwork.Clickoncreatetypeofworkmethod();
	
	//createtypeofwork.clickondeletetypeofworkmethod();
	
	
}
}
