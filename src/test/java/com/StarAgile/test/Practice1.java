package com.StarAgile.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {
	
	@Test
	public void TestngTest1() throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject"); 
		
		WebElement logincustomer = driver.findElement(By.xpath("//button[@ ng-click = 'customer()']"));
		
		logincustomer.click();
		
		Thread.sleep(2000);
		
	//WebElement name = driver.findElement(By.xpath("//select[@id='userSelect']"));
		
		//Select dd = new Select(name);
		
		//dd.deselectByIndex(2);*//
		
		
		
	}
	
	//* Test Case 2

			@Test	
			public void TestngTest2() throws InterruptedException {
					
					
					
					
					
				}
				
			
				@Test
				public void TestngTest3() {
					
					
					
				}
	
	
			
			@BeforeMethod
			
			public void beforemethod() {
				
				System.out.println("Login to portal");
			}
			
			@AfterMethod 
			
			public void aftermethod() {
				
				System.out.println("Completed login process");
			}
			
			@BeforeClass
			
			public void beforeclass() {
				
				System.out.println("Launching browser");
			}
			
			@AfterClass 
			
			public void afterclass() {
				
				System.out.println("closing browser");
			}


}
