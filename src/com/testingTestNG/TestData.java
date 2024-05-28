package com.testingTestNG;

import org.testng.annotations.DataProvider;

public class TestData {
	@DataProvider(name="chintu")
	public String[][] pincodesData() {
	String[][] pincodes={{"411001"},
		               {"411002"},
	                   {"411003"},
	                   {"411004"},
	                   {"411005"}};
	 return pincodes;
	
	}

}
