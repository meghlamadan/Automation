package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeSettingsPage 
{
	public WebDriver driver;
	
	@FindBy (xpath="//a[.='Types of Work']")
	private WebElement clickonTypesofwork;
	
	
	
public ActitimeSettingsPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
public void clickonTypesworkmethod()
{
	clickonTypesofwork.click();
}
}
