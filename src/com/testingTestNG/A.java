package com.testingTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A{

	
	@Test(priority=4)
	private void m3() {
		System.out.println("m3 of A");
	}
	
	@Test(enabled=false)
	private void m1() {
	System.out.println("m1 of A");
	}
	
	@Test(priority=5)
	private void Test() {
		System.out.println("before method");

		}


	@Test(priority=3)
	private void m2() {
		System.out.println("m2 of A");

		}
	
	
	@Test(priority=1)
	private void m4() {
		System.out.println("m4 of A");

		}
	@Test(invocationCount=2)
	private void m5() {
		System.out.println("I am method");

		}
}

