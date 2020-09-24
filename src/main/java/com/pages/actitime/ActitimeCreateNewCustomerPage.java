package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitme.AutoConstant;
import com.generics.actitme.BasePage;
import com.generics.actitme.ExcelLibrary;


public class ActitimeCreateNewCustomerPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextarea;
	
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	private WebElement createcustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;

	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createcustomermethod() throws IOException, InterruptedException
	{
		Thread.sleep(4000);
		entercustomernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name1, 1, 0));
		entercustomerdescriptionTextarea.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name1, 1, 1));
		createcustomerButton.click();
	}
	
	public void cancelMethod()
	{
		cancelButton.click();
	}
	
	public void okbuttonMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alertaccept();
	}
}
	
	
	


