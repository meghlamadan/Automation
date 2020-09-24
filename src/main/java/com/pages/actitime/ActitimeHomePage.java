package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {
	public WebDriver driver;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement timetrackLink;
	
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement ReportsLink;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement CalendersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement SettingsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	//Utilisation
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Intialisation
	public void timetrackMethod()
	{
		timetrackLink.click();
	}
	public void tasksMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		tasksLink.click();
	}
	public void reportsMethod()
	{
		ReportsLink.click();
	}
	public void usersMethod()
	{
		usersLink.click();
	}
	public void calenderMethod()
	{
		CalendersLink.click();
	}
	public void settingsMethod()
	{
		SettingsLink.click();
	}
	public void integrationMethod()
	{
		integrationsLink.click();
	}
	public void helpandsupportMethod()
	{
		helpandsupportLink.click();
	}
	public void logoutMethod()
	{
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", logoutLink);
		
		logoutLink.click();
	}
	
	
	
	
	
	
	
	
	
	

}
