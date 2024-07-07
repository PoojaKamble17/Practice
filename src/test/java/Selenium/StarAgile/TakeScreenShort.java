package Selenium.StarAgile;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShort {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://developer.microsoft.com/");
		
		File screenshort = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(screenshort, new File ("C:\\Users\\DELL\\Desktop\\New folder\\image.png"));
	}

}
