package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://automationexercise.com/contact_us");
	

	
	
	// id locator 
	
			WebElement message  = driver.findElement(By.id("message"));
			
			message.sendKeys("hello");
			
			
			// name locator 
			
			WebElement username1  = driver.findElement(By.name("email"));
			
			username1.sendKeys("hello");
			
			// class name 
			
			WebElement subject = driver.findElement(By.className("form-control"));
			
			subject.sendKeys("hello");
			
			// link text
			
			WebElement submit = driver.findElement(By.linkText("Submit"));
			
			submit.click();
			
			// partial link text
			
			WebElement submit1 = driver.findElement(By.partialLinkText("Sub"));
			
			submit1.click();
			
			// tag name 
			
			WebElement signup = driver.findElement(By.tagName("a"));
			
			signup.click();
		

}
}

