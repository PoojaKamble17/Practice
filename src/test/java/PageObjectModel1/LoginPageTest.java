package PageObjectModel1;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  //LoginPage lp = new LoginPage();
	  String aurl = lp.getAppUrl();
	  Assert.assertTrue(aurl.contains("live"));
	  System.out.println("Test Pass ! URL matched!");
  }
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String atitle = lp.getAppTitle();
	  Assert.assertTrue(atitle.contains("HRM"));
	  System.out.println("Title matched");
  }
  
  @Test(priority=3)
  public void verifyLogin() 
  {
	  lp.doLogin("Admin", "admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"));
	  System.out.println("Login Completed");
	  
  }
}