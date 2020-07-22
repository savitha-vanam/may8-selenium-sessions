package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {
	static WebDriver driver;
	public static void main(String []args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//WebElement industry=driver.findElement(By.id("Form_submitForm_Industry"));
		//Select select=new Select(industry);
		//select.selectByVisibleText("Aerospace");
		//select.selectByValue("Aerospace");
		//select.selectByIndex(2);
	    By Industry=By.id("Form_submitForm_Industry");
		
		//doselectbyvalue(Industry,"Aerospace");
		
		// doselectbyindex(Industry,2);	
	    doselectbyvisibletext(Industry,"Telecoms / Communications");
	}
	public static void  doselectbyvalue(By locator,String value) {
	
		Select select=new Select(getElement(locator));
		select.selectByValue(value);	
		}
	public static void  doselectbyindex(By locator,int value) {
		
		Select select=new Select(getElement(locator));
		select.selectByIndex(value);	
	
	}
	
    public static void  doselectbyvisibletext(By locator,String value) {
		
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);	
    }
	
	
	
	public  static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	
	

}
