package com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.google.com/");	
		driver.close();
	}
}
