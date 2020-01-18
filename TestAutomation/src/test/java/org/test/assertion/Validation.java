package org.test.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static boolean checkElementExists(WebDriver driver , String xpath)
	{
		boolean result =false;
		try
		{
			driver.findElement(By.xpath(xpath));
			result = true;
		}
		catch(Exception e){}
		return result;
	}
	
}

