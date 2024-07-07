package Selenium.StarAgile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		Thread.sleep(2000);
		
		// context click
		
				WebElement rtclick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
				
				Actions act = new Actions(driver);
				
				act.contextClick(rtclick).perform();
				
				Thread.sleep(2000);
				
				Alert alt = driver.switchTo().alert();
				
				alt.accept();

				Thread.sleep(2000);

				// double click 
				
				WebElement ele = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
				
				act.doubleClick(ele).perform();
				
				Thread.sleep(2000);

	}

}

