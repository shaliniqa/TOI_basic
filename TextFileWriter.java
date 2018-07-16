package com.qait.automation.getpageobjects;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
public class TextFileWriter extends GetPage
{

	public TextFileWriter(WebDriver driver, String pageName) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub
        this.webdriver = driver;
        this.pageName = pageName;
	}

	public void txt_writer(String newsHeading, String news) throws IOException
	{
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		FileWriter fr=new FileWriter("D:\\data.txt"+newsHeading+" "+date);
		BufferedWriter br=new BufferedWriter(fr);

		br.write(news);

		br.close();
	}
}
