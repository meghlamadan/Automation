package com.pages.actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generics.actitme.AutoConstant;
import com.generics.actitme.BasePage;
import com.generics.actitme.ExcelLibrary;



public class ActitimeLeaveType extends BasePage implements AutoConstant
{
	public WebDriver driver;
	//Declaration
	@FindBy (xpath="//a[.='Leave Types']")
	private WebElement ClickonLeaveTypes;
	
	@FindBy (xpath="//span[.='Create Leave Type']")
	private WebElement ClickonCreateLeaveType;
	
	@FindBy (xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement EnternameLeaveType;
	
	//@FindBy (xpath="//input[@id='leaveTypeLightBox_nameField']")
	//@FindBy (xpath="//input[@id='inputDiv']")
	//private WebElement Editleavetype;
	
	@FindBy (xpath="//span[contains(text(),'Mat')]")
	private WebElement Clickonnewtypeofwork;
	
	@FindBy (xpath="//div[@class='buttonIcon']")
	private WebElement ClickonCreateLeaveType2;
	
	@FindBy(xpath="(//span[.='sss'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement Clickondeletebutton;
	
	//Intialisation
	public ActitimeLeaveType(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Utilisation
	public void ClickonLeaveTypesMethod()
	{
		ClickonLeaveTypes.click();
	}
	public void ClickonCreateLeaveTypeMethod()
	{
		ClickonCreateLeaveType.click();
	}
	public void EnternameLeaveTypeMethod() throws IOException
	{
		EnternameLeaveType.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name3, 1, 0));
	}
	public void Clickoncreatedtypeofworkmethod() throws AWTException, InterruptedException
	{
		Clickonnewtypeofwork.click();
		
		 Thread.sleep(4000); 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_HOME);
		 for(int i=0;i<10;i++)
			{
				Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_DELETE);

			}
		 //Clickonnewtypeofwork.sendKeys("sick");
			}
	
			/*
			 * public void EditLeaveTypeMethod() throws InterruptedException {
			 * //Editleavetype.clear(); Thread.sleep(4000); Editleavetype.sendKeys("sick");
			 * }
			 */
	
	public void ClickonCreateLeaveType2Method() throws InterruptedException
	{
		Thread.sleep(4000);
		ClickonCreateLeaveType2.click();
	}
	public void ClickondeletebuttonMethod()
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//span[.='sss'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']"))));
		Clickondeletebutton.click();
	}

}
