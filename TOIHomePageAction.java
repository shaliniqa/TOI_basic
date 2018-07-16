package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;
import com.sun.jna.platform.win32.WinUser.HARDWAREINPUT;

public class TOIHomePageAction extends GetPage {

	public TOIHomePageAction(WebDriver driver) {
		super(driver, "TOIHomePage");
		// TODO Auto-generated constructor stub
	}
	

	public void verifyIsOnRightPage() throws InterruptedException
	{
		wait.waitForPageToLoadCompletely();
		isElementDisplayed("TOI_title");
		
		//handleAlert();

		//verifyPageTitleContains();


	}
	
	public void HandlePopUp()
	{
		if(isElementDisplayed("PopUp_dactive"))
		{
			element("PopUp_dactive").click();
		}
	}
}