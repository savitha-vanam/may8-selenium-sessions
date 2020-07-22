package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			WebElement login=driver.findElement(By.id("ctl00_HyperLinkLogin"));
			Actions ac=new Actions(driver);
			ac.moveToElement(login).perform();
			WebElement spiceclub=driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
		    ac.moveToElement(spiceclub).perform();
            Thread.sleep(2000);
	            driver.findElement(By.linkText("Sign up")).click();
		   

	}

}
