package com.OrangeHRM.basePage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.OrangeHRM.PageObjects.HomePage;
import com.OrangeHRM.PageObjects.LogOut;
import com.OrangeHRM.PageObjects.LoginPage;

public class BaseTest implements Application_Constants
{
	public WebDriver driver;
	Properties pro;
	FileInputStream fis;
	LoginPage LP;
	LogOut LO;
	public HomePage HP;
	public WebDriverWait EW;
	@BeforeClass
	public void OpenBrowser() throws Exception
	{		
			pro = new Properties();
			fis = new FileInputStream(Property_Path);
			pro.load(fis);
			System.setProperty(Chrome_Key,Chrome_Value);
			driver = new ChromeDriver();
			driver.get(pro.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(WaitTime,TimeUnit.SECONDS);
			HP = new HomePage(driver);
	}
			
	
	@BeforeMethod
	public void Login()
	{
		LP = new LoginPage(driver);
		LP.EnterUsn().sendKeys(pro.getProperty("usn"));
		LP.EnterPsw().sendKeys(pro.getProperty("psw"));
		LP.ClkLgn().click();
		Reporter.log("usn");
		
	}
	@AfterMethod
	public void SignOut(ITestResult result)
	{
		if(result.FAILURE==result.getStatus())
		{
			CaptureDefect.Defect(driver,result.getName());
		}
		LO = new LogOut(driver);
		LO.ClickLogo().click();
		LO.ClickLogout().click();
	}
	
	@AfterClass
	public void CloseAppn()
	{
		driver.close();
	}

	
	
	
}
