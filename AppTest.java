package com.qait.TestDemo;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;





public class AppTest {
	
	@org.testng.annotations.Test
	public void Test() throws InterruptedException
	{
		String exepath="C:\\Users\\asus\\workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		Thread.sleep(10000);
		//WebElement button=driver.findElement(By.xpath("//input[@name='btnI']"));
		//String buttonValue="I'm Feeling Lucky";
		//button.click();
		//Assert.assertEquals(button.getText(), buttonValue);
		driver.findElement(By.xpath("//a[@class='ntfc_dactive']")).click();;
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1.size());
        Iterator<String> i1=s1.iterator();
        
        String cityNews=driver.findElement(By.xpath("//ul[@class='list2']")).getText();
		System.out.println(cityNews);
		WebElement Tech=driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[7]/a"));
		WebElement Technews=driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[7]/div/div[1]/ul/li[1]/a"));
		//public static void HoverAndClick(WebDriver driver,WebElement elementToHover,WebElement elementToClick) {
			Actions action = new Actions(driver);
			action.moveToElement(Tech).click(Technews).build().perform();
		//}
		
		
		
	}
}