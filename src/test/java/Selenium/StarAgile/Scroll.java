package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
		WebElement pp = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
		
		Actions act = new Actions(driver);
		
		//Scroll till the element is visible
		
		act.scrollToElement(pp);
		
		pp.click();

	}

}
