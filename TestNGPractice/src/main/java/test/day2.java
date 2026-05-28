package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day2 {
@Test
	public void homeLoanWebLogin() {
		System.out.println("Home Loan WebLogin");

	}
@Test
public void homeLoanDesktopLogin() {
	System.out.println("Home Loan Desktop Login");
}
@Test
public void homeLoanMobileLogin() {
	System.out.println("Home Loan Mobile login");
}
@AfterSuite
public void afterSuite() {
	System.out.println("i am After Suite");
}

}
