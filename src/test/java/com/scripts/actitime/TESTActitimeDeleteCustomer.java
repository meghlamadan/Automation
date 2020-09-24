package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeDeleteCustomer;
import com.pages.actitime.ActitimeEditCustomer;
import com.pages.actitime.ActitimeHomePage;



public class TESTActitimeDeleteCustomer extends BaseTest{
	@Test
	public void deletecustomer() throws InterruptedException, IOException
	{
		ActitimeHomePage home= new ActitimeHomePage(driver);
		home.tasksMethod();
		
		ActitimeDeleteCustomer delete=new ActitimeDeleteCustomer(driver);
		delete.clickonsearchmethod();
		delete.clickonjavamethod();
		
		ActitimeEditCustomer settingicon=new ActitimeEditCustomer(driver);
		settingicon.settingiconmethod();
		
		ActitimeDeleteCustomer actions=new ActitimeDeleteCustomer(driver);
		actions.clickonactionmethod();
		actions.clickondeletebuttonmethod();
		actions.clickondeletepermanentlymethod();
	}
	
	

}
