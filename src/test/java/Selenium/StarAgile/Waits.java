package Selenium.StarAgile;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	private static final String ExpectedCondtions = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/login/");
		
		//implicit waits
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		
		username.clear();
		
		//Explicit wait
		
		WebDriverWait wt = new WebDriverWait (driver, Duration.ofSeconds(5));
		
		wt.until(ExpectedConditions.visibilityOf(username));

		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
		
		login.click();
		
		
	}

}
 	