package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void main() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");

	}

	@Test
	public void PersonalLoanWebLogin() {
		System.out.println("WebLogin");
	}

	@Test
	public void PersonalLoanMobileLogin() {
		System.out.println("Mobile login");
	}

	@Test
	public void PersonalLoanDesktopLogin() {
		System.out.println("DesktopLgin");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("i am before test");
	}

}
