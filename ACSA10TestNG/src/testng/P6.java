package testng;

import org.testng.annotations.Test;

public class P6 {
	@Test(priority=1)
	public void openApp() {
		System.out.println("Application open");
	}
	@Test(priority=3)
	public void closeApp() {
		System.out.println("Application close");
	}
	@Test(priority=2)
	public void useApp() {
		System.out.println("Application is using");
	}
}
