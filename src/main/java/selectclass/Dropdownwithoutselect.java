package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownwithoutselect {
	 static WebDriver driver;
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//By country=By.id("Form_submitForm_Country");
		//By Industry=By.id("Form_submitForm_Industry");
		By options=By.xpath("//select[@id=\"Form_submitForm_Industry\"]/option");
		getdropdownoptionsvalue(options,"electronics");

	}
	public static void getdropdownoptionsvalue(By locator,String value){
		List<WebElement>industryoptions=driver.findElements(locator);
		//System.out.println(industryoptions.size());
		for(int i=0;i<industryoptions.size();i++) {
			String text=industryoptions.get(i).getText();
			//System.out.println(text);
			if(text.equalsIgnoreCase(value)) {
				industryoptions.get(i).click();
				break;
			}
			
		}
		
		
	}	

}
