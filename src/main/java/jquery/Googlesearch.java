package jquery;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Googlesearch {
       static WebDriver driver ;
    	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("https:Google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		By search=By.xpath("//ul[@class='erkvQe']/li//span");
		//getsuggestionlist(search,"selenium webdriver");
		//getsuggestionlist(search,"selenium python","selenium foods");
		getsuggestionlist(search,"all");
		}
			public static void getsuggestionlist(By locator,String... text) throws InterruptedException {
				List<WebElement>suggestionlist=driver.findElements(locator);
				if(!text[0].equalsIgnoreCase("All")){
					for(int i=0;i<suggestionlist.size();i++) {
						   String mesg=suggestionlist.get(i).getText();
						    System.out.println(mesg);
							  for(int k=0;k<text.length;k++){
							   if(mesg.equals(text[k])) {	
								suggestionlist.get(i).click();				
								driver.navigate().back();					
								driver.findElement(By.name("q")).sendKeys("selenium");
								Thread.sleep(2000);
								suggestionlist=driver.findElements(locator);
										}
									}
							}
				      }     
						else {
					try {
   						 for(int j=0;j<suggestionlist.size();j++) {
							suggestionlist.get(j).click();	
							driver.navigate().back();					
							driver.findElement(By.name("q")).sendKeys("selenium");
							Thread.sleep(2000);
							suggestionlist=driver.findElements(locator);
							}
						
					} catch (Exception e) {
						
					}
					     }
                    }
              }            