package com.qait.demo.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class MoveToTechTest {
private TestSessionInitiator testSessionInitiator;
	
	@BeforeTest
    public void initializeVariable(){
        testSessionInitiator = new TestSessionInitiator(this.getClass().getName());
	}
	
	@Test
	public void TechIconTest()
	{
		testSessionInitiator.launchApplication();
		testSessionInitiator.moveToTechAction.selectTech();
	}
	

}
