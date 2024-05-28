package com.testingTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sneakers {

	@Test
	public void m1() throws InterruptedException {
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("Sneakers",Keys.ENTER);
		
		Thread.sleep(3000);
		List<WebElement> liTags=driver.findElements(By.xpath("//ul[@class=\"pagination-container\"]/li"));
		//*[@id="desktopSearchResults"]/div[2]/section/ul/li[1]
		
		//li[@class="product-base"]
	
		String cnt= liTags.get(liTags.size()-2).findElement(By.tagName("a")).getText();
		
	
		
		int count =Integer.parseInt(cnt); // Convert string into integer Here Integer is Weapper class
		System.out.println("Count of pages: " +count);
		
		

	}
}
