package Selenium.StarAgile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
System.setProperty("webdriver.edge.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win32\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		// get method is to used for launching th browser
		
		driver.get("https://developer.microsoft.com/");
		
		// get title to get the page title
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		//current Url featches the launched browser ulr
		
		String Currenturl = driver.getCurrentUrl();
		
		System.out.println(Currenturl);
		
		// get page source
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		//close to close the current browser session
		
		driver.close();
		
		//quit : to close all browser sessions of driver
		
		driver.quit();
		
	}
	

}
