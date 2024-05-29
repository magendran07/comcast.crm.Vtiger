package com.comcast.crm.javaUtility;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.comcast.crm.generic.fileutility.fileutilityTest;
/**
 * Author Name :Magendran 
  Purpose :This Class contains the  date and randomNumber Generation commands;
 
 **/

public class javaUtilityTest {

	public void getSystemData() {
		Date date=new Date();
	}
	public void getSystemDateInFormat(String format) {
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat(format);
		String dateFormat=formatter.format(date);
		
	}
	public static String randomNumber() throws IOException {
		fileutilityTest file=new fileutilityTest();
		String name=file.getDataFormPropertyFile("headerName");
		Random rand=new Random();
	String randomNumber=name+rand.nextInt();
		 return randomNumber;
	}
	
	}

