package Selenium.StarAgile;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHndling {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		Thread.sleep(2000);
		
		// get the parent window handle
		
		String parentwindow = driver.getWindowHandle();
		
		System.out.println(parentwindow);
		
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		click.click();
		
		Thread.sleep(2000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		
		while (iterator.hasNext()) {
			
			String childwindow = iterator.next();
			
			if (!parentwindow.equals(childwindow)) {
				
				driver.switchTo().window(childwindow);
				
				String text = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
				
				System.out.println(text);
				
				driver.close();
				
				Thread.sleep(1000);
				
				// Switch back to parent window
				
				//driver.switchTo().defaultContent();
				
				// when click on elemental selinum
				
				//WebElement elemental = driver.findElement(By.xpath("//a[@href='http://elementalselenium.com/']"));
				
				//elemental.click();
				
				
				
				
			}
		}
	}

}
