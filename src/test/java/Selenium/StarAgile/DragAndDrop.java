package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Thread.sleep(2000);
		
		// context click
		
				WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
				
				WebElement destination = driver.findElement(By.xpath("//div[@id='column-b']"));
				
				Actions act = new Actions(driver);
				
				act.dragAndDrop(source, destination).perform();
	}

}
