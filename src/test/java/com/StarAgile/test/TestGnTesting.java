package com.StarAgile.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class TestGnTesting {
	
	// @Test - testing will understand that it should run the method with @Test annotation
	
	// Test Case 1
	
	
	@Test
	public void TestngTest1() {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://developer.microsoft.com/");
		
	}
	
	// Test Case 2
	
	@Test	
	public void TestngTest2() {
			
			System.setProperty("webdriver.edge.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win32\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://developer.microsoft.com/");
			
		}
		
	
		@Test
		public void print() {
			
			System.out.println("Hello World");
		}


}
