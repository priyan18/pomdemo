package com.atipune.pom.tests;

import org.openqa.selenium.WebDriver;

public class TestBase {
  
	public static  WebDriver driver;
	
	public static void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSC\\eclipse-workspace\\POMDEMO\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	
	
}
