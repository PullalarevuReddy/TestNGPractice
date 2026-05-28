package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.accountRegistrationPage;

public class TC01_AccountRegistration {



	public WebDriver driver;
		@BeforeClass
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com.gr/index.php?route=account/register");
		}
		@AfterClass
		public void tearDown() {
			driver.close();
		}
		
		@Test
		public void verify_account_registration() {
			accountRegistrationPage ar= new accountRegistrationPage( driver);
			ar.setFirstName("Chakradhar");
			ar.setFirstName("Reddy");
			ar.setEmail("chakrireddy170@gmail.com");
			ar.setPhoneNumber("6301856217");
			ar.setPasword("Chakri@1234");
			ar.setConfirmPassword("Chakri@1234");
			
			
			
			
		}
		
		
		

	

}
