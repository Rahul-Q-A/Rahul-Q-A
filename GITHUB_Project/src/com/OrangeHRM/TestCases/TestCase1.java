package com.OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OrangeHRM.basePage.BaseTest;
import com.OrangeHRM.basePage.ReadExcel;

public class TestCase1 extends BaseTest
{

	@Test
	public void AddEmp() throws Exception
	{
		HP.ClkPim().click();
		HP.ClkAddEmp().click();

		HP.ClkSave().click();
	}
	@Test
	public void Name()
	{
		System.out.println("Gagana");
		Reporter.log("swthi@420");
	}

	
	
}
