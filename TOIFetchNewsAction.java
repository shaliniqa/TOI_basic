package com.qait.demo.keywords;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.TextFileWriter;

public class TOIFetchNewsAction extends TextFileWriter
{

	public TOIFetchNewsAction(WebDriver driver) {
		super(driver, "TOIFetchNews");
		// TODO Auto-generated constructor stub
	}
	
	public void section_CityStories() throws IOException
	{
		String news=element("cityNewsData").getText();
		txt_writer("City News", news);
	}

}
