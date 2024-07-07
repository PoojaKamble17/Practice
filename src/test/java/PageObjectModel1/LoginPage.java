package PageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	// Encapsulation = Data + Methods()
	
	private WebDriver driver;
	
	
	// Initialization of driver
	public LoginPage(WebDriver driver)// driver from base class
	{
		this.driver = driver;
	}
	
	
	//Data (locators) by locator technique
	private By username = By.name("username");
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
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pws);
		driver.findElement(btn).click();
		
	}
	

}
