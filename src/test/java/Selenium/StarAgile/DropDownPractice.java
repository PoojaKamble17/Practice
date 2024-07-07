package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='States']"));
		
		Select dd = new Select (dropdown);
		
		dd.isMultiple();
		
		dd.selectByIndex(1);
		dd.selectByIndex(2);
		
		Thread.sleep(2000);
		
		dd.deselectByIndex(2);
		
		dd.selectByVisibleText("California");
		dd.selectByVisibleText("Florida");
		
		Thread.sleep(2000);
		
		dd.deselectByVisibleText("California");
		
		Thread.sleep(2000);
		
		dd.selectByValue("New York");
		dd.selectByValue("Florida");
		
		Thread.sleep(2000);
		
		dd.deselectByValue("New York");
	}

}
