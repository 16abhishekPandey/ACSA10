package testng;

import org.testng.annotations.Test;

public class P8 {
	@Test(priority=1 )
	public void carrot() {
		System.out.println("from carrot ");
	}
	@Test(priority=1)
	public void basket() {
		System.out.println("from basket");
	}
	@Test(priority=1)
	public void apple() {
		System.out.println("from apple method");
	}
}
