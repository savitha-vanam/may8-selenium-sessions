package action;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
			WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
           Actions ac=new Actions(driver);
           ac.contextClick(rightclick).perform();
          By options= By.xpath("//ul[@class='context-menu-list context-menu-root']"
                    + "/li[contains(@class,'context-menu-icon')]");
           Thread.sleep(2000);
           dorightclick(options,"Paste");
                    	}
		public static void dorightclick(By locator,String value) {
		 List<WebElement>rightclickoptions=driver.findElements(locator);
			System.out.println(rightclickoptions.size());
			for(int i=0;i<rightclickoptions.size();i++) {
				String text=rightclickoptions.get(i).getText();
				System.out.println(text);
				if(text.equals(value)) {
					rightclickoptions.get(i).click();
					break;
				}
						}
		
		
		
		
	}
       

}
