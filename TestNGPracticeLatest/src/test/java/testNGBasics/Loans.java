package testNGBasics;

import org.testng.annotations.Test;

public class Loans {
	@Test(groups="Browser")
	public void HomeLoanLoginOnBrowser() {
		System.out.println("HomeLoanLoginOnBrowser");

	}

	@Test(groups="Mobile")
	public void HomeLoanLoginOnMobile() {
		System.out.println("HomeLoanLoginOnMobile");

	}

	@Test
	public void HomeLoanLoginOnDesktop() {
		System.out.println("HomeLoanLoginOnDesktop");

	}
	@Test
	public void HomeLoanLoginForAllDevices() {
		System.out.println("HomeLoanLoginForAllDevices");
		
	}
	@Test(groups="Browser")
	public void CarLoanLoginOnBrowser() {
		System.out.println("CarLoanLoginOnBrowser");
		
	}
	@Test(groups="Mobile")
	public void CarLoanLoginOnMobile() {
		System.out.println("HomeLoanLoginOnMobile");

	}

	@Test
	public void CarLoanLoginOnDesktop() {
		System.out.println("HomeLoanLoginOnDesktop");

	}
	@Test
	public void CarLoanLoginForAllDevices() {
		System.out.println("HomeLoanLoginForAllDevices");
		
	}
	

}
