package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		// frames by using index, id, name, xpath
		
		// xpath
		
		WebElement fr = driver.findElement(By.xpath("//iframe[@id = 'mce_0_ifr']"));
		
		// index
		
		// driver.swichTo().frame(0);
		
		// id
		
		//driver.switchTo().frame("mce_0_ifr");
		
		driver.switchTo().frame(fr);
		
		WebElement content = driver.findElement(By.xpath("//body[@id = 'tinymce']"));
		
		content.clear();
		
		Thread.sleep(1000);
		
		content.sendKeys("Hello World");
		
		Thread.sleep(1000);
		
		driver.close();

	}

}
