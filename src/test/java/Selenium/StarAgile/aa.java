package Selenium.StarAgile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aa {
	
	public void main (String [] args) {
	
	public void navigateToGoogleAndSearch() {
	       // to navigate to the website and enter the search term
	       System.out.println("Navigating to the website");
	       WebDriver driver;
		driver.get("https://www.google.com");


	       System.out.println("Entering search term as lambdatest");
	       driver.findElement(By.name("q")).sendKeys("lambdatest");


	       // explicit wait to wait for the auto suggestions list to be present
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@role='listbox']")));
	       System.out.println("Auto-suggestions list found");
	   }
	}

	private void navigateToGoogleAndSearch() {
		// TODO Auto-generated method stub
		
	}
}


