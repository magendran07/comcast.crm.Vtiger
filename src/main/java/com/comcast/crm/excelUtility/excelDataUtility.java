 package com.comcast.crm.excelUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelDataUtility {
public 	static String username;
	 public static String password;
	 
public void  getDataFromExcelFile(int num) throws  IOException {
	try {
		
		FileInputStream fis=new FileInputStream("./testdata/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("sheet1");
		Row row=sheet.getRow(num);
		username=row.getCell(3).getStringCellValue();
		password=row.getCell(4).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		fis.close();
	}
	catch (Exception e) {
		System.out.println(e +" Data is not present");
	}
		
	}

public void writeBackData(String name) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\User\\Documents\\TestData.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
Sheet sheet=wb.getSheet("sheet1");
Row row=sheet.getRow(1);
Cell cel=row.createCell(3);
cel.setCellType(CellType.STRING);
cel.setCellValue(name);
FileOutputStream fos= new FileOutputStream("C:\\Users\\User\\Documents\\TestData.xlsx");
wb.write(fos);
wb.close();
System.out.println("Executed");

	
}
}


