package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateOrangeHrmLogin {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		
		username.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		
		password.sendKeys("admin123");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
		
		login.click();
		
	}

}
