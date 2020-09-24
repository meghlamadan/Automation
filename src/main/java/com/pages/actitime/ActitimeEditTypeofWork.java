package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitme.AutoConstant;
import com.generics.actitme.BasePage;
import com.generics.actitme.ExcelLibrary;


public class ActitimeEditTypeofWork extends BasePage implements AutoConstant
{
	public WebDriver driver;
	//declaration
	@FindBy (xpath="//input[@id='name']")
	private WebElement Edittypeofwork;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement clickonsavechanges;
	
	@FindBy(xpath="//a[.='Manager']/../..//a[contains(text(),'delete')]")
	private WebElement editdeleteTypeofWork;
	//intialisation
	public ActitimeEditTypeofWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//utilisation
	public void edittypeofworknamemethod() throws InterruptedException, IOException
	{
		Edittypeofwork.clear();
		Thread.sleep(4000);
		Edittypeofwork.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name2, 1, 2));
	}
	public void savechangesmethod()
	{
		clickonsavechanges.click();
	}
	public void editdeletetypeofworkmethod()
	{
		editdeleteTypeofWork.click();
		//alertaccept();
	}

}
