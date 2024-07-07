package com.StarAgile.test;

import org.testng.annotations.Test;

public class TestNGSkip {
	
	@Test (priority = 0, enabled = false) 
	public void testcase1()  {
		
		System.out.println("Testcase1 is executed");
	}
	
	@Test (priority = 2)
	public void testcase2() {
		
		System.out.println("Testcase2 is executed");
	}
	
	@Test (priority = 1)
	public void testcase3() {
		
		System.out.println("Testcase3 is executed");
	}
	
	@Test (priority = 4)
	public void testcase4() {
		
		System.out.println("Testcase4 is executed");
	}

}
