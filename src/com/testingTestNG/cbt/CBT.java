package com.testingTestNG.cbt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT {
	
   WebDriver driver;
   
   @Parameters("browser-name")
   @BeforeMethod
	public void setUP1(String browserName) {
	   if(browserName.equalsIgnoreCase("Chrome")) {
		   driver= new ChromeDriver();
		 }  else if(browserName.equalsIgnoreCase("Firefox")) {
			 driver= new FirefoxDriver();
		 }
		 else if(browserName.equalsIgnoreCase("MicrosoftEdge")) {
			 driver= new InternetExplorerDriver();
		 }
	   else{
		   System.out.println("Invalid browser name :" +browserName);
	   }
	   
	   
   }@Test
	public void m1() throws InterruptedException {
	
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("Sneakers",Keys.ENTER);
		
		Thread.sleep(3000);
		List<WebElement> liTags=driver.findElements(By.xpath("//ul[@class=\"pagination-container\"]/li"));
		String cnt= liTags.get(liTags.size()-2).findElement(By.tagName("a")).getText();
		int count =Integer.parseInt(cnt); // Convert string into integer Here Integer is Wrapper class
		System.out.println("Count of pages: " +count);
		
	}

}
