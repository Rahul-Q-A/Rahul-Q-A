package com.OrangeHRM.basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements Application_Constants
{
	public static String ReadData(String Sheet,int row,int cell) throws Exception
	{
		FileInputStream fis = new FileInputStream(Excel_Path);
		Workbook Book = WorkbookFactory.create(fis);
		Cell cel = Book.getSheet(Sheet).getRow(row).getCell(cell);
		String value = cel.getStringCellValue().toString();
		return value;
	}

}
