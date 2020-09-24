package com.pages.actitime;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitme.AutoConstant;
import com.generics.actitme.BasePage;
import com.generics.actitme.ExcelLibrary;



public class ActitimeEditCustomer extends BasePage implements AutoConstant{
	public WebDriver driver;
	
	
	@FindBy (xpath="(//span[contains(text(),'Sel')])")
	private WebElement clickoneditbutton;
	
	@FindBy (xpath="(//div[@class='editButton'])[18]")
	private WebElement clickonsetting;
	
	@FindBy (xpath="(//input[@placeholder='Enter Customer Name'])")
	private WebElement nameLabel;
	
	public ActitimeEditCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	 public void editcustomerbuttonmethod() 
	 {
	 clickoneditbutton.click(); 
	 }
	 
	 public void settingiconmethod()
	 {
		 clickonsetting.click();
	 }
	 
	 public void clickonnamelabelmethod() throws InterruptedException, IOException, AWTException
	 {
		 Thread.sleep(3000);
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()", nameLabel);
		 nameLabel.clear();
		 nameLabel.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name1, 1, 3));
		 robotEnter();
	 }
	

}
