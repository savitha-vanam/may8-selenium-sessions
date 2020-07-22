package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Themes {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		By themes=By.linkText("Themes");
		doclick(themes);
		driver.navigate().back();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'content\']/iframe")));
		By drag=By.xpath("//*[@id=\"draggable\"]/p");
	   boolean flag= getElement(drag).isDisplayed();
	   System.out.println(flag);
	    if(flag=true){
	    	System.out.println("Drag me around webelement is visible");
	    }else{
	    	System.out.println("Drag me around webelement is not visible");
	      }
	    driver.switchTo().defaultContent();
	    By support=By.linkText("Support");
	    doclick(support);
				}
		public static WebElement getElement(By locator) {
		WebElement ele=driver.findElement(locator);
		return ele;
		}
		public static void doclick(By locator) {
		getElement(locator).click();
		}
	}