package com.testingTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo {

	/*@DataProvider(name="chintu")
	public String[][] pincodesData() {
	String[][] pincodes={{"411001"},
		               {"411002"},
	                   {"411003"},
	                   {"411004"},
	                   {"411005"}};
	 return pincodes;
	
	}*/

	@Test(dataProvider = "chintu", dataProviderClass=TestData.class)
	public void myTestCase(String pincodes1) {
		System.out.println(pincodes1);

	}
}
