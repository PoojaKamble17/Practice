package Selenium.StarAgile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJava {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		// vertical scrolling
		
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				// vertical scrolling by some pixels - down 
				
				js.executeScript("window.scrollBy(0 ,800)", "");
				
				// up scroll
				
				js.executeScript("window.scrollBy(0 ,-400)", "");
				
				
				// horizontal
				
				js.executeScript("window.scrollBy(600 ,0)", "");
				
				// up scroll
				
				js.executeScript("window.scrollBy(-400  ,0)", "");

	}

}
