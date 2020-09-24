package com.pages.actitime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTypeofWork {
	public WebDriver driver;
	//Declaration
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement ClickonCreateTypeofWork;
	
	@FindBy(xpath="//a[contains(text(),'Teach')]")
	private WebElement clickonTypeofWork;

	@FindBy(xpath="//a[.='asdf']/../..//a[contains(text(),'delete')]")
	private WebElement deleteTypeofWork;
	

	//Intialisation

	public ActitimeTypeofWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
    //Utilisation
	public void clickoncreatetypeofworkmethod()
	{
		ClickonCreateTypeofWork.click();
	}
	public void clickontypeofworkmethod()
	{
		clickonTypeofWork.click();
	}
	
	 public void clickondeletetypeofworkmethod() 
	 { 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("arguments[0].click",deleteTypeofWork);
	//deleteTypeofWork.click();	 
	 }
	 


}
