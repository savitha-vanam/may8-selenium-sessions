package com.mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BasePageTest {
	
	@Test
	public void getHomePageTitle() {
		doLogin();
		String title=driver.getTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		System.out.println("Title is "+ title);
		
	}
	public void doLogin() {
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("//input[@type='submit']")));
	}
	
}
