package com.OrangeHRM.TestCases;

import org.testng.annotations.Test;

import com.OrangeHRM.basePage.BaseTest;

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
	public void open()
	{
	System.out.println("Saurabh");
}
}