package com.testingTestNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D {
	
	@Test
	 public void mc() {
		System.out.println("m2 of D");
	}

	@Parameters({"x", "y"})
	@Test
	 public void m1(String x, String y) {
		System.out.println(x +" " +y);
	}
}
