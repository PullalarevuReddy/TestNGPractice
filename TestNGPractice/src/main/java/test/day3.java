package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day3 {
@Test
	public void vehicleLoanWebLogin() {
		System.out.println("Vehicle Loan Web Login");
		}
@Test
public void vehicleLoanDesktopLogin() {
	System.out.println("Vehicle Loan Desktop Login");
}
@Test
public void vehicleLoanMobileLogin() {
	System.out.println("Vehicle Loan Mobile login");
}
@AfterTest
public void afterTest() {
	System.out.println("i am after test");
}

}
