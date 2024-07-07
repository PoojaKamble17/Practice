package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win32\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// get method is to used for launching the browser
		
		driver.get("https://www.geeksforgeeks.org/");
		
		Thread.sleep(2000);
		
		WebElement link_test = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]"));
		
		link_test.click();
		
		driver.close();
	}

}
