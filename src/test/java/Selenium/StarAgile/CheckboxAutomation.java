package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAutomation {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox1 = driver.findElement(By.xpath("(//form[@id='checkboxes'])[1]"));
		
		checkbox1.click();
		
		Thread.sleep(1000);
		
		WebElement checkbox2 = driver.findElement(By.xpath("(//form[@id='checkboxes'])[2]"));
		
		checkbox2.click();
		

		
		
	}

}
