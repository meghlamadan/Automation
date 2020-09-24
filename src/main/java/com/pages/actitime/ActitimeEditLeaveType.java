package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generics.actitme.AutoConstant;
import com.generics.actitme.BasePage;
import com.generics.actitme.ExcelLibrary;



public class ActitimeEditLeaveType extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy (xpath="//input[@id='inputDiv']")
	private WebElement Editleavetype;
	
	@FindBy (xpath="(//div[@class='applyButton'])[2]")
	private WebElement Clickonapplybutton;
	
	@FindBy(xpath="(//span[.='Sick'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement Clickondeletebuttonedit;
	
	public ActitimeEditLeaveType(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Editleavenametypemethod() throws IOException
	{
		Editleavetype.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name3, 1, 3));
	}
	public void Clickonapplybuttonmethod()
	{
		Clickonapplybutton.click();
	}
	public void Clickondeletebuttoneditmethod() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//span[.='sick'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']"))));
		Thread.sleep(6000);
		Clickondeletebuttonedit.click();
	}
		
	

}
