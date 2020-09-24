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



public class ActitimeDeleteCustomer extends BasePage implements AutoConstant {
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchTextfield;
	
	@FindBy (xpath="(//span[contains(text(),'Jav')])")
	private WebElement clickonJava;
	
	@FindBy (xpath="((//div[@class='action'])[1])")
	private WebElement clickonactions;
	
	@FindBy (xpath="(//div[@class='deleteButton'])[1]")
	private WebElement clickdeletebutton;
	
	@FindBy (xpath="(//span[.='Delete permanently'])")
	private WebElement deletepermanently;
	
	public ActitimeDeleteCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickonsearchmethod() throws IOException
	{
		searchTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name1, 1, 3));
	}
	public void clickonjavamethod()
	{
		
		clickonJava.click();
	}
	public void clickonactionmethod() throws InterruptedException
	{
		 Thread.sleep(3000);
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()", clickonactions);
		 
		//clickonactions.click();
	}
	public void clickondeletebuttonmethod()
	{
		clickdeletebutton.click();
	}
	public void clickondeletepermanentlymethod()
	{
		deletepermanently.click();
	}

}
