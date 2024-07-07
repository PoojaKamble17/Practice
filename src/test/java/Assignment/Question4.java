package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 
 
 
 
public class Question4 {
    public static void main(String[] args) throws InterruptedException {
 
        WebDriver driver = new ChromeDriver();
 
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
 
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
      
        WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
 
        email.clear();
        System.out.println("Entering the User Name");
        email.sendKeys("Admin");
        
        Thread.sleep(2000);
 
        password.clear();
        System.out.println("Entering the password");
        password.sendKeys("admin123");
        Thread.sleep(2000);
        
 
        System.out.println("Clicking login button");
        loginButton.click();
 
        String title = "OrangeHRM";
 
        String actualTitle = driver.getTitle();
 
        System.out.println("Verifying the page title has started");
        Assert.assertEquals(actualTitle,title,"Page title doesn't match");
 
        System.out.println("The page title has been successfully verified");
 
        System.out.println("User logged in successfully");
 
       // driver.quit();
    }
}