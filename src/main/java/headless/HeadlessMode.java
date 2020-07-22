package headless;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessMode {
       static WebDriver driver;
	public static void main(String[] args) {
		//healess--->it means without browser
		//testing is happening behind the scene
		//headed mode---->it means with browser
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		//driver=new ChromeDriver(co);
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
		driver=new FirefoxDriver(fo);
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String actualtitle = driver.getTitle();
		System.out.println("Title is :"+actualtitle);
		
		
	}

}
