package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitme.AutoConstant;
import com.generics.actitme.BasePage;
import com.generics.actitme.ExcelLibrary;



public class ActitimeTasksPage extends BasePage implements AutoConstant{
	public WebDriver driver;
	//declaration
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newprojectLink;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newTaskLink;
	
	@FindBy(xpath="//div[@class='item importTasks']")
	private WebElement importtaskfromcsvLink;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchTextfield;
	
	//initalization
	
	public ActitimeTasksPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	//Utilization
	public void addnewmethod()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addNewButton);
	}
	public void newcustomermethod()
	
	{
		newcustomerLink.click();
	}
	public void newprojectmethod()
	{
		newprojectLink.click();
	}
	public void newtaskmethod()
	{
		newTaskLink.click();
	}
	public void newimporttaskfromcsvmethod()
	{
		importtaskfromcsvLink.click();
	}
	public void searchmethod() throws IOException
	{
		searchTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name1, 1, 0));
	}

}
