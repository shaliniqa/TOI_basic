package com.qait.demo.tests;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class TOIHomePageTest {
	private TestSessionInitiator testSessionInitiator;
	
	@BeforeTest
    public void initializeVariable(){
        testSessionInitiator = new TestSessionInitiator(this.getClass().getName());
	}
	
	@Test
	public void verifyPage() throws InterruptedException, IOException
	{
	    testSessionInitiator.launchApplication();
		testSessionInitiator.toiHomePageAction.verifyIsOnRightPage();
		testSessionInitiator.toiHomePageAction.HandlePopUp();
		testSessionInitiator.toiFetchNewsAction.section_CityStories();


	}
	
}