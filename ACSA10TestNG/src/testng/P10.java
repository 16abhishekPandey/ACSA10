package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P10 {
	@Test(priority=100,invocationCount=4)
	public void carrot() {
		System.out.println("from carrot ");
	}
	
	@Test(priority=-500, invocationCount=2)
	public void basket() {
		System.out.println("from basket");
	}
	
	@Test(priority=-2000, invocationCount=7)
	public void apple() {
		System.out.println("from apple method");
	}

}
