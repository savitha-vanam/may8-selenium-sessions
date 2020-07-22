package testngSessions;

import org.testng.annotations.Test;


public class ExpectedException {
	
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void getNumberTest() {
		System.out.println("get Number");
		int  i=9/0;
	    System.out.println("Arithemetic Exception");
			
		
		
	}
	
	

}
