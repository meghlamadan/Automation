package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitme.BaseTest;
import com.pages.actitime.ActitimeCreateNewCustomerPage;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeTasksPage;



public class TESTActitimeCreateCustomer extends BaseTest
{
	@Test
	public void createcustomer() throws IOException, InterruptedException
	{
		ActitimeHomePage home= new ActitimeHomePage(driver);
		home.tasksMethod();
		
		ActitimeTasksPage task=new ActitimeTasksPage(driver);
		task.addnewmethod();
		task.newcustomermethod();
		
		
		ActitimeCreateNewCustomerPage createcustomer= new ActitimeCreateNewCustomerPage(driver);
		createcustomer.createcustomermethod();
	}
}
