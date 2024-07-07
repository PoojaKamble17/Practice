package Selenium.StarAgile;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email"));
		
		Actions builder = new Actions (driver);
		
		Action seriesoffact = builder.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys("Pooja").build();
		
		seriesoffact.perform();
		
		
	}

}
