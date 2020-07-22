package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main" );
		driver.switchTo().frame(driver.findElement(By.name("main")));
		WebElement ele= driver.findElement(By.tagName("h2"));
		String text=ele.getText();
		System.out.println(text);
		
        
	}

}
