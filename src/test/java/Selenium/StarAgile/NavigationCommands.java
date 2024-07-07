package Selenium.StarAgile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.edge.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win32\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		// to: is used to launched the browser
		
		driver.navigate().to("https://developer.microsoft.com/");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

	

}
