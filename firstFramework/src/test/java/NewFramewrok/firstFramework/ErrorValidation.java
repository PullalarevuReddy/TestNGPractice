package NewFramewrok.firstFramework;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.ProductCatalogPage;
import testComponents.BaseTest;

public class ErrorValidation extends BaseTest {
	@Test
	public void LoginErrorValidation() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
		// LoginPage loginPage = launchApp();
		loginPage.loginApp("chakrireddy170@gmail.com", "Chakri@14433");
		Assert.assertEquals("Incorrect email or password.", loginPage.getErrorMessage());

	}
	@Test
	public void productErrorValidation() {
		String productName = "ADIDAS ORIGINAL";
		//LoginPage loginPage = launchApp();
		loginPage.loginApp("chakrireddy170@gmail.com", "Chakri@143");
		ProductCatalogPage productCatalogPage = new ProductCatalogPage(driver);
		productCatalogPage.getProductList(productName);
		String toastMessage = productCatalogPage.getToastMessage();
		System.out.println(toastMessage);
		productCatalogPage.clickOnCart();
		CartPage cartPage = new CartPage(driver);
		Assert.assertEquals(productName, cartPage.getCheckOutProductNames());
		
	}
}
