package com.qait.demo.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class TOIFetchNewsTest {
	TestSessionInitiator testSessionInitiator;

	@BeforeTest
    public void initializeVariable(){
        testSessionInitiator = new TestSessionInitiator(this.getClass().getName());
	}
	
	@Test
	public void FetchNews() throws IOException
	{
		testSessionInitiator.toiFetchNewsAction.section_CityStories();
	}

}
