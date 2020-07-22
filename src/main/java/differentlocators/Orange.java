package differentlocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Orange {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(5000);
		String actualtitle = driver.getTitle();
		System.out.println("Title is :"+actualtitle);
	//1st method	
//driver.findElement(By.className("labeledtext")).sendKeys("www.google.com");
//driver.findElement(By.xpath("//*[@id=\'Form_submitForm_LastName\']")).sendKeys("vanam");
//driver.findElement(By.xpath("//*[@id='Form_submitForm_FirstName']")).sendKeys("srikanth");
//driver.findElement(By.xpath("//*[@id=\'Form_submitForm_JobTitle\']")).sendKeys("Quality Analyst");		
//driver.findElement(By.cssSelector("#Form_submitForm_Email")).sendKeys("vanam.savitha@gmail.com");		
//driver.findElement(By.xpath("//*[@id='Form_submitForm_CompanyName']")).sendKeys("ADP");
//driver.findElement(By.cssSelector("#Form_submitForm_NoOfEmployees")).sendKeys("151-200");		
//driver.findElement(By.xpath("//*[@id=\'Form_submitForm_Industry\']")).sendKeys("Healthcare");		
//driver.findElement(By.xpath("//*[@placeholder='Contact Phone']")).sendKeys("6303251115");
//driver.findElement(By.xpath("//*[@name='Country']")).sendKeys("United States");
//Thread.sleep(2000);
//driver.findElement( By.xpath("//*[@id=\'Form_submitForm_State\']")).sendKeys("Florida");
//driver.findElement(By.xpath("//*[@class='checkbox']")).click();
//driver.findElement(By.xpath("//*[@id=\'Form_submitForm_action_request\']")).click();
      //Thread.sleep(3000);
//___________________________________________________________________________________________	
		//2nd method
//		WebElement text=driver.findElement(By.className("labeledtext"));
//		WebElement lastname=driver.findElement(By.xpath("//*[@id=\'Form_submitForm_LastName\']"));
//		WebElement firstname=driver.findElement(By.xpath("//*[@id='Form_submitForm_FirstName']"));
//		WebElement jobtitle=driver.findElement(By.xpath("//*[@id=\'Form_submitForm_JobTitle\']"));
//		WebElement email=driver.findElement(By.cssSelector("#Form_submitForm_Email"));		
//	    WebElement companyname=driver.findElement(By.xpath"//*[@id='Form_submitForm_CompanyName']"));
//		WebElement noofemployees=driver.findElement(By.cssSelector("#Form_submitForm_NoOfEmployees"));		
//		WebElement industry=driver.findElement(By.xpath("//*[@id=\'Form_submitForm_Industry\']"));		
//		WebElement phoneno=driver.findElement(By.xpath("//*[@placeholder='Contact Phone']"));
//		WebElement country=driver.findElement(By.xpath("//*[@name='Country']"));
///		WebElement state=driver.findElement( By.xpath("//*[@id=\'Form_submitForm_State\']"));
//		WebElement checkbox=driver.findElement(By.xpath("//*[@class='checkbox']"));
//		WebElement submitbutton=driver.findElement(By.xpath("//*[@id=\'Form_submitForm_action_request\']"));
//	     text.sendKeys("srujan");
//	      lastname.sendKeys("vanam");
//	      firstname.sendKeys("srikanth");
//	      jobtitle.sendKeys("Quality Analyst");
//	      email.sendKeys("vanam.savitha@gmail.com");
//	      companyname.sendKeys("ADP");
//	      noofemployees.sendKeys("201-250");
//	      industry.sendKeys("Healthcare");
//	      phoneno.sendKeys("6303251115");
//	      country.sendKeys("United States");
//	      Thread.sleep(3000);
//	      state.sendKeys("Florida");
//	      checkbox.click();
//	      submitbutton.click();      
//__________________________________________________________________________________________________
		
		By text=By.className("labeledtext");
		By lastname=By.name("LastName");
		By firstname=By.name("FirstName");
		By jobtitle=By.id("Form_submitForm_JobTitle");
		By email=By.cssSelector("#Form_submitForm_Email");
		By companyname=By.xpath("//*[@id='Form_submitForm_CompanyName']");
		By noofemployees=By.cssSelector("#Form_submitForm_NoOfEmployees");
		By industry=By.id("Form_submitForm_Industry");
	    By phoneno=By.id("Form_submitForm_Contact");
        By country=By.xpath("//*[@name='Country']");
        By state=By.xpath("//*[@id=\'Form_submitForm_State\']");
        By checkbox=By.className("checkbox");
        By submit=By.xpath("//*[@id=\'Form_submitForm_action_request\']");
        
        //3rd method
//        driver.findElement(text).sendKeys("srujan");
//        driver.findElement(lastname).sendKeys("vanam");
//        driver.findElement(firstname).sendKeys("srikanth");
//        driver.findElement(jobtitle).sendKeys("Quality Analyst");
//        driver.findElement(email).sendKeys("vanam.savitha@gmail.com");
//        driver.findElement(companyname).sendKeys("ADP");
//        driver.findElement(noofemployees).sendKeys("201-250");
//        driver.findElement(industry).sendKeys("Healthcare");
//        driver.findElement(phoneno).sendKeys("6303251115");
//        driver.findElement(country).sendKeys("United States");
//        Thread.sleep(2000);
//        driver.findElement(state).sendKeys("Florida");
//        driver.findElement(checkbox).click();
//        driver.findElement(submit).click();
//        
//        Thread.sleep(2000);
//_____________________________________________________________________________________________        
        //4th method
//   getElement(text).sendKeys("srujan");
//   getElement(lastname).sendKeys("vanam");
//   getElement(firstname).sendKeys("srikanth");
//   getElement(jobtitle).sendKeys("Quality Analyst");
//   getElement(email).sendKeys("Vanam.savitha@gmail.com");
//   getElement(companyname).sendKeys("ADP");
//   getElement(noofemployees).sendKeys("201-250");
//   getElement(industry).sendKeys("Healthcare");
//   getElement(phoneno).sendKeys("6303251115");
//   getElement(country).sendKeys("United States");
//   Thread.sleep(2000);
//   getElement(state).sendKeys("Florida");
//   getElement(checkbox).click();
//   getElement(submit).click();
//_____________________________________________________________________________________________        
       //5th method 
       dosendkeys(text,"srujan");
       dosendkeys(lastname,"vanam");
       dosendkeys(firstname,"srikanth");
       dosendkeys(jobtitle,"Quality Analyst");
       dosendkeys(email,"vanam.savitha@gmail.com");
       dosendkeys(companyname,"ADP");
       dosendkeys(noofemployees,"201-250");
       dosendkeys(industry,"Healthcare");
       dosendkeys(phoneno,"6303251115");
       dosendkeys(country,"United States");
       Thread.sleep(2000);
       dosendkeys(state,"Florida");
       doclick(checkbox);
       doclick(submit);
  driver.quit();
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


