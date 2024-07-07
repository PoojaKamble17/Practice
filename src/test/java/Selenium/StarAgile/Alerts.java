package Selenium.StarAgile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Thread.sleep(2000);
		
		//Simple Alerts
	
		WebElement simplealert = driver.findElement(By.xpath("//input[@name='alert']"));
		
		simplealert.click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		Thread.sleep(2000);
		
		// Confirmational Alert
		
		WebElement conalert = driver.findElement(By.xpath("//input[@name='confirmation']"));
		
		conalert.click();
		
		Alert alt1 = driver.switchTo().alert();
		
		alt1.dismiss();
		
		Thread.sleep(2000);
		
		
		// Prompt Alert
		
				WebElement promptalert = driver.findElement(By.xpath("//input[@name='prompt']"));
				
				promptalert.click();
				
				Alert alt2 = driver.switchTo().alert();
				
				Thread.sleep(2000);
				
				alt2.sendKeys("Pooja");
				
				String str = alt2.getText();
				
				System.out.println(str);
				
				alt2.accept();
				
	}

}
