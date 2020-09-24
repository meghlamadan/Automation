package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitme.AutoConstant;
import com.generics.actitme.BasePage;
import com.generics.actitme.ExcelLibrary;


public class ActitimeCreateNewTypeofWorkPage extends BasePage implements AutoConstant{
	
	public WebDriver driver;
	//Declaration
	@FindBy (xpath="//input[@id='name']")
	private WebElement enterNewtypename;
	
	@FindBy (xpath="//input[@value='   Create Type of Work   ']")
	private WebElement clickonCreatetypeofwork;
	//Utilisation
	public ActitimeCreateNewTypeofWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Intialisation
	public void Enternewtypenmaemethod() throws IOException
	{
		enterNewtypename.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name2, 1, 0));
	}
	public void Clickoncreatetypeofworkmethod()
	{
		clickonCreatetypeofwork.click();
	}
}
