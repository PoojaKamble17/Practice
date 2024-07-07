package Selenium.StarAgile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		Thread.sleep(2000);
		
		//find the no of rows in table
		
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		
		int rowsize = rowno.size();
		System.out.println(rowsize);
		
		//find the no of columns in table
		
				List<WebElement> colno = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
				
				int colsize = colno.size();
				System.out.println(colsize);
				
				// find cell data
				
				WebElement celldata = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[6]/td[2]"));
				
				String celltext = celldata.getText();
				System.out.println(celltext);
				
				String ExpectedText = "Angola";
				
				if(celltext.equals(ExpectedText)) {
					
					System.out.println("Cell data is matches");

				}else {
					
					System.out.println("Cell data is not match");
				}
	}

}
