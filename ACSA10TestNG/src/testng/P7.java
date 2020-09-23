package testng;

import org.testng.annotations.Test;

public class P7 {
	@Test(priority=100)
	public void carrot() {
		System.out.println("from carrot ");
	}
	@Test(priority=-500)
	public void basket() {
		System.out.println("from basket");
	}
	@Test(priority=-2000)
	public void apple() {
		System.out.println("from apple method");
	}
}
