package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Encapsulation data-method
	
	private WebDriver driver;
	
	// Initialization of driver
	
	public LoginPage(WebDriver driver)// driver from base class
	{
		this.driver = driver;
	}
	
	// data(locators) - by locator
	
	private By usrname = By.name("username");
	private By password = By.name("password");
	private By btn = By.xpath("//button[@type='submit']");
	
	//methods
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void doLogin(String un, String pws) 
	{
		driver.findElement(usrname).sendKeys(un);
		driver.findElement(password).sendKeys(pws);
		driver.findElement(btn).click();
		
	}
	

}
