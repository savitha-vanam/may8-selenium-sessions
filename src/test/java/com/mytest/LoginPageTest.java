package com.mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest  extends BasePageTest{
	
	
	@Test
	public void getLoginPageTitle() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		System.out.println("Title is "+ title);
	}
	
}
