package com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PimBtn;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement AddEmpBtn;
	
	@FindBy(name="firstName")
	private WebElement FnTf;
	
	
	@FindBy(name="middleName")
	private WebElement MnTf;
	
	@FindBy(name="lastName")
	private WebElement LnTf;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement SaveBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement ClkPim()
	{
		return PimBtn;
	}
	
	public WebElement ClkAddEmp()
	{
		return AddEmpBtn;
	}
	public WebElement EntrFn()
	{
		return FnTf;
	}
	
	public WebElement EntrMn()
	{
		return MnTf;
	}
	public WebElement EntrLn()
	{
		return LnTf;
	}
	
	public WebElement ClkSave()
	{
		return SaveBtn;
	}

}
