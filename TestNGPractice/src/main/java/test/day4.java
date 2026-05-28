package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void ccWebLogin() {
		System.out.println("CC WebLogin");
	}
	@Test
	public void ccDesktopLogin() {
		System.out.println("CC Desktop Login");
	}
	@Test
	public void ccMobileLogin() {
		System.out.println("CC Mobile Login ");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("i am Before Suite");
	}

}
