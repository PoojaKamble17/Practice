package com.StarAgile.test;

import org.testng.annotations.Test;

import Selenium.StarAgile.LoginPage;

public class LoginTest {
	
	LoginPage lp = new LoginPage();

	@Test
	public void login() throws InterruptedException {
		lp.setup();
		lp.login();

	}

@Test
	public void LogoVerification() {
		lp.setup();
		lp.verifylogo();

	}

	@Test
	public void Forgotpasswordverf() {
		lp.setup();
		lp.verifyforgotpasswsdlink();
		
	}
	}
	



