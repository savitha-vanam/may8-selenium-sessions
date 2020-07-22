package alertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	//java script popup---->alert
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	WebElement name=driver.findElement(By.name("proceed"));
	name.click();
	Thread.sleep(3000);
	Alert alert=driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	if(text.equals("Please enter a valid user name")) {
		System.out.println("correct text");
	}else {
		System.out.println("invalid text");
	}
	alert.accept();//click ok button
	//alert.dismiss();//cancel button
  driver.switchTo().alert();
  }

}



