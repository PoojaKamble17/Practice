package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dummypoint.com/DragAndDrop.html");
		
		Thread.sleep(2000);
		
		// context click
		
				WebElement source = driver.findElement(By.xpath("//input[@type='search']"));
				
				WebElement destination = driver.findElement(By.xpath("//div[@id='drop']"));
				
				Actions act = new Actions(driver);
				
				act.dragAndDrop(source, destination).perform();
	}

}
