package com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut
{
	@FindBy(xpath="//img[@alt='profile picture' and @src='/web/index.php/pim/viewPhoto/empNumber/7']")
	private WebElement logo;
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logopt;
	
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement ClickLogo()
	{
		return logo;
	}
	
	
	public WebElement ClickLogout()
	{
		return logopt;
	}

}
