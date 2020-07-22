package alllinks;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Countrydetails {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	List<WebElement>allinks=driver.findElements(By.xpath("//*[@id=\"header-navbar\"]/ul[1]/li/a"));
    System.out.println(allinks.size());
	
    for(int i=0;i<allinks.size();i++) {
		String text=allinks.get(i).getText();
		System.out.println(text);
		allinks.get(i).click();
		allinks=driver.findElements(By.xpath("//*[@id=\"header-navbar\"]/ul[1]/li/a"));
	  	}
		
	}

}
