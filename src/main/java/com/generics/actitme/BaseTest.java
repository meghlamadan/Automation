package com.generics.actitme;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@BeforeMethod
	public void loginintoApp() throws IOException
	{
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
	}

	@BeforeSuite
	public void startExecution()
	{
		Reporter.log("execution is starting",true);
	}
	@AfterSuite
	public void stopExecution()
	{
		Reporter.log("execution is completed",true);
	}
	
	 @AfterClass 
	 public void closeBrowser() { 
     ActitimeHomePage home=new ActitimeHomePage(driver); 
     home.logoutMethod();
	  
	 }
	 

}
