package com.testingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {

	/*@Test
	public void m1() {

		String s1 = "Hi";
		String s2 = "Hello";

		//Assert.assertEquals(s1, s2);
		Assert.assertFalse(false);
		Assert.assertEquals("hi", "hey");

	}*/
	
	@Test
	public void m2() {
		 SoftAssert softly= new SoftAssert();
		 softly.assertEquals("Hi", "Hello");
		 softly.assertEquals("Hi", "Hi");
		 softly.assertEquals("Hi", "Hey");
		 
		 softly.assertAll();
	}
}
