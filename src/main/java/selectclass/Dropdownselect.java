package selectclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownselect {
	  static WebDriver driver;

   public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country=By.id("Form_submitForm_Country");
		By Industry=By.id("Form_submitForm_Industry");
//		WebElement countryEle=driver.findElement(country);
//		Select select=new Select(countryEle);
//		List<WebElement>droplist=select.getOptions();
//		System.out.println(droplist.size());
//	     for(int i=0;i<droplist.size();i++) {
//	    	 String text=droplist.get(i).getText();
//		System.out.println(text);
//	}
List<String>countrylist=getdropdownoptionsvalue(country);
System.out.println(countrylist);
System.out.println("---------------------------------");
List<String>Industrylist=getdropdownoptionsvalue(Industry);
System.out.println(Industrylist);
}

   public static List<String> getdropdownoptionsvalue(By locator) {
	  List<String>options=new ArrayList<String>();
	   Select select=new Select(getElement(locator));
		List<WebElement>droplist=select.getOptions();
		System.out.println(droplist.size());
	     for(int i=0;i<droplist.size();i++) {
	    	 String text=droplist.get(i).getText();
		//System.out.println(i+"-->"+text);
	    	options.add(text); 
	}
	     return options;
	    
	}
   public  static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}   
   
  

}
