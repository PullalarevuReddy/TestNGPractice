package project;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LoginPage;
import testComponents.TestBase;

public class ErrorValidation extends TestBase {
	@Test
	public void Application() throws IOException {
		// TODO Auto-generated method stub
		LoginPage loginPage = intilizeBrowser();

		loginPage.launchApplication("chakrireddy170@gmail.com", "chakri@1234");
		Assert.assertEquals( "Incorrect email or passwords",loginPage.errorMessage());
		

	}

	

}
