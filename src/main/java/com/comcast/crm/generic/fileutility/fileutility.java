package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileutility {
	public  static String getDataFormPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./configAppData/commonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
	return pobj.getProperty(key);
	}
}