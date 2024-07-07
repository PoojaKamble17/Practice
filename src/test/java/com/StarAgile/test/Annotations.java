package com.StarAgile.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void testcase1 () {
		
		System.out.println("Testcase 1 is executing");
	}
	
	@Test
	public void testcase2 () {
		
		System.out.println("Testcase 2 is executing");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("Launching the browser");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("Closing the browser");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("DB connection is opened");
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("DB connection is closed");
	}




}
