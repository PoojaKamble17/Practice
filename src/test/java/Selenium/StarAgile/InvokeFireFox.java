package Selenium.StarAgile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFireFox {

	public static void main(String[] args) {
		
System.setProperty("webdriver.firefox.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://developer.microsoft.com/");
	}

}
