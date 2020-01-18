package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.pages.LoginPage;

public class Base {

	public static WebDriver startDriver()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		
		driver.get("https://www.facebook.com");
		return driver;
	}
	
}
