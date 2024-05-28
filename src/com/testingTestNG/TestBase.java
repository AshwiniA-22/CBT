package com.testingTestNG;

import org.testng.annotations.BeforeTest;

public class TestBase {

	@BeforeTest
	public void sampleMethod() {
		
 System.out.println("Before Test");
	}
}
