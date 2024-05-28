package com.testingTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C {
	
	
	@Test
	private void c1() {
	System.out.println("m1 of C");

	}
	@Test
	private void c2() {
		System.out.println("m2 of C");

		}
	@Test
	private void c3() {
		System.out.println("m3 of C");

		}
	@BeforeMethod
	private void c4() {
		System.out.println("m4 of C");

		}

}
