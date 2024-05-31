package com.OrangeHRM.TestCases;

import org.testng.Assert;
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
	public void test()
	{
		System.out.println("Hello12345678945");
	}

	
	@Test
	public void addname() {
		System.out.println("jagadish");
	}

	
	
}
