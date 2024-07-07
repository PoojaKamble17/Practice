package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// Radio Button
		
		WebElement radiobutton1 = driver.findElement(By.xpath("//input[@ value = 'radio1']"));
		
		radiobutton1.click();
		
		WebElement radiobutton2 = driver.findElement(By.xpath("//input[@ value = 'radio2']"));
		
		radiobutton2.click();
		
		WebElement radiobutton3 = driver.findElement(By.xpath("//input[@ value = 'radio3']"));
		
		radiobutton3.click();
		
		//Drop Down
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@ name = 'dropdown-class-example']"));
		
		Select dd = new Select (dropdown);
		
		dd.isMultiple();
		
		dd.selectByIndex(1);
		dd.selectByIndex(2);
		
		Thread.sleep(2000);
		
		/*dd.deselectByIndex(2);
		
		dd.selectByVisibleText("Option1");
		Thread.sleep(2000);
		dd.selectByVisibleText("Option3");
		
		Thread.sleep(2000);
		
		dd.deselectByVisibleText("Option1");
		
		Thread.sleep(2000);
		
		dd.selectByValue("option2");
		Thread.sleep(2000);
		dd.selectByValue("option3");
		
		Thread.sleep(2000);
		
		dd.deselectByValue("option 3");*/
		
		Thread.sleep(2000);
		
		// check box
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@ id = 'checkBoxOption1']"));
		
		checkbox1.click();
		
		
		
	}

}
