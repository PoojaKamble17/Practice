package Selenium.StarAgile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdge {

	public static void main(String[] args) {
		
System.setProperty("webdriver.edge.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win32\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://developer.microsoft.com/");
	}

}
