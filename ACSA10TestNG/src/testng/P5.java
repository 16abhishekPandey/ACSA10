package testng;

import org.testng.annotations.Test;

public class P5 {
	@Test
	public void abhishek() {
		System.out.println("from abhishek ");
	}
	@Test
	public void abhishek(int i) {
		System.out.println("from abhishek ");//TestNGException (if we give formal arg. )
	}
}
