package com.mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePageTest {
	WebDriver driver;
	String browserName="chrome";

	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browserName) {
		if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
				}
		else {
			System.out.println("please pass the correct browser");
		}
		driver.get("http://www.crmpro.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}


}
