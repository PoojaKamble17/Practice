package com.StarAgile.test;

import org.testng.annotations.Test;

public class TestNGDependsOnMethod {
	
	@Test
	public void dbconnection() {
		
		System.out.println("Database is connected");
	}
	
	@Test (dependsOnMethods = {"dbconnection"})
	public void queery1() {
		
		System.out.println("Querry one is executed");
	}

}
