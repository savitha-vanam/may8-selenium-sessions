package frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Crmpro {
    static WebDriver driver;
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("http://www.crmpro.com/");
		By username=By.name("username");
		By password=By.name("password");
		By login=By.xpath("//input[@value='Login\']");
		By contacts=By.xpath("//a[@title='Contacts']");
		By Logout=By.xpath("html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a");
		dosendkeys(username,"batchautomation");
		dosendkeys(password,"test@12345");
		doclick(login);
		driver.switchTo().frame("mainpanel");
		doclick(contacts);
		doclick( Logout );
		}
	public static WebElement getElement(By locator) {
		WebElement ele=driver.findElement(locator);
		return ele;
		}
	public static void dosendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		}
	public static void doclick(By locator) {
		getElement(locator).click();
		}
	}
