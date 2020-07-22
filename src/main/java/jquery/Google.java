package jquery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	driver.get("https:Google.com");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(2000);
	By search=By.xpath("//ul[@class='erkvQe']/li//span");
	
	suggestionlist(search,"selenium python");
	suggestionlist(search,"selenium webdriver");
	}
	public static void suggestionlist(By locator,String value) throws InterruptedException  {
		List<WebElement>suggestionlist=driver.findElements(locator);
		for(int j=0;j<suggestionlist.size();j++) {
			String gettext=suggestionlist.get(j).getText();
			if(value.equals(gettext)) {
				suggestionlist.get(j).click();
				driver.navigate().back();
				driver.findElement(By.name("q")).sendKeys("selenium");
				Thread.sleep(2000);
				suggestionlist=driver.findElements(locator);
			}
		}
	}

	}
