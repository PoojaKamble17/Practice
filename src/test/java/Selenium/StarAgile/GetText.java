package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(1000);
		
		//gettext() method
		
		WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Log in to Facebook')]"));
		
		String text = login.getText();
		
		System.out.println(text);
		
		// getAttribute() method
		
		WebElement button = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		String idtext = button.getAttribute("id");
		
		System.out.println(idtext);
		
		// getcssvalue() method
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		String cssvalue = loginbutton.getCssValue("color"); 
		
		System.out.println(cssvalue);
		
		//is selected
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		if (button1.isSelected()) {
			
			//button1.click();
			
		}
		
		//is displayed
		
				WebElement button2 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
				
				if (button2.isDisplayed()) {
					
					//button2.click();
					
				}
				
				//is Enabled
				
				WebElement button3 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
				
				if (button3.isEnabled()) {
					
					//button3.click();
					
				}
				
				//get location()
				
				WebElement button4 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
				System.out.println(button4.getLocation());
			
				
				// //get size()
				
				WebElement button5 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
				System.out.println(button5.getSize());
			
				
				
				
				
		
		
		
	}

}
