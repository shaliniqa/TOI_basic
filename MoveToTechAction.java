package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qait.automation.getpageobjects.GetPage;

public class MoveToTechAction extends GetPage {

	public MoveToTechAction(WebDriver driver) {
		super(driver, "MoveToTech");
		// TODO Auto-generated constructor stub
	}
		
	public void selectTech()
	{
		isElementDisplayed("Tech_link");
        //HoverAndClick(element("Tech_link"),element("techNews_link"));
		Actions action = new Actions(getDriver());
		action.moveToElement(element("Tech_link")).click(element("technews_link")).build().perform();
	}


}
