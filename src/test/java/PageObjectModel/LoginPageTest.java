package PageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass{
  @Test(priority=1)
  public void verifyUrl() 
  {
	 // LoginPage lp = new LoginPage();
	  String aurl = lp.getAppUrl();
	  Assert.assertTrue(aurl.contains("live"));
	  System.out.println("Test Pass! Url Matched");
  }
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String atitle = lp.getAppTitle();
	  Assert.assertTrue(atitle.contains("HRM"), "Test Fail: Title not matched");
	  System.out.println("Test Pass: Title matched");
  }
  
  @Test(priority=3)
  public void verifyLogin() 
  {
	  lp.doLogin("Admin", "admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"), "Login Failed");
	  System.out.println("Login completed");
	  
  }
}
