package myTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apple {


	@BeforeClass
	public void m1() {
		System.out.println("I am m1");
	}
@BeforeSuite
	public void m2() {
		System.out.println("I am m2");

	}

	@Test
	public void m3() {
		System.out.println("I am m3");

	}

	@BeforeTest
	public void m4() {
		System.out.println("I am m4");

	}
@AfterSuite
	public void m5() {
		System.out.println("I am m5");

	}

}
