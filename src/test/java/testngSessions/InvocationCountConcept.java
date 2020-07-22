package testngSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	@Test(invocationCount=10)
	public void getNumber() {
		System.out.println("InvocationCount");
		
	}

}
