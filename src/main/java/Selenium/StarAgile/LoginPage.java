package Selenium.StarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;

	// xpaths

	private By username = By.xpath("//input[@name = 'username']");
	private By password = By.xpath("//input[@name = 'password']");
	private By login = By.xpath("//button[@type = 'submit']");
	private By forgotpassw = By.linkText("Forgot your password? ");
	private By logo = By.xpath("//div[@class = 'orangehrm-login-branding']");

	// functions
	
	// set up 
	
	public void setup() {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

	// login function

	public void login() throws InterruptedException {

		driver.findElement(username).clear();

		driver.findElement(username).sendKeys("Admin");

		Thread.sleep(2000);

		driver.findElement(password);

		driver.findElement(password).sendKeys("admin123");

		Thread.sleep(2000);

		driver.findElement(login).click();

	}

	public void verifylogo() {

		driver.findElement(logo).isDisplayed();

	}

	public void verifyforgotpasswsdlink() {

		driver.findElement(forgotpassw).isDisplayed();

	}

}
