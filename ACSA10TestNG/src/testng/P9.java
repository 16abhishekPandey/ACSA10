package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P9 {
	@Test(invocationCount=4)
	public void carrot() {
		System.out.println("from carrot ");
		Reporter.log("from carrot");
	}
	@Test(invocationCount=2)
	public void basket() {
		System.out.println("from basket");
	}
	@Test(invocationCount=7)
	public void apple() {
		System.out.println("from apple method");
	}
}
