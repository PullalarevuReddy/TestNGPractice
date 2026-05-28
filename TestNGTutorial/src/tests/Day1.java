package tests;

import org.testng.annotations.Test;

public class Day1 {
	@Test(dependsOnMethods="bTest")                      //execution sequence using dependsOnMethod attribute
	public void aTest() {
		System.out.println("a");
	}
	@Test(dependsOnMethods="dTest")
	public void bTest() {
		System.out.println("b");
	}
	@Test
	public void cTest() {
		System.out.println("c");
	}
	@Test(dependsOnMethods="cTest")
	public void dTest() {
		System.out.println("d");
	}

}
