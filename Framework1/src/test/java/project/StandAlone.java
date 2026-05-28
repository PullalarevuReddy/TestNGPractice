package project;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testComponents.TestBase;

public class StandAlone extends TestBase {



	@Test
	public void Application() throws IOException {
		// TODO Auto-generated method stub
		LoginPage loginPage = intilizeBrowser();

		loginPage.launchApplication("chakrireddy170@gmail.com", "Chakri@1234");

	}

}
