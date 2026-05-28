package NewFramewrok.firstFramework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.ProductCatalogPage;
import testComponents.BaseTest;

public class SubmitOrderTest extends BaseTest {
	@Test(dataProvider = "getData")
	public void launchApplication(String mail, String pass, String productName)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String countryName = "India";
		// LoginPage loginPage = launchApp();
		loginPage.loginApp(mail, pass);
		ProductCatalogPage productCatalogPage = new ProductCatalogPage(driver);
		productCatalogPage.getProductList(productName);
		String toastMessage = productCatalogPage.getToastMessage();
		System.out.println(toastMessage);
		productCatalogPage.clickOnCart();
		CartPage cartPage = new CartPage(driver);
		String prodName = cartPage.getCheckOutProductNames();
		System.out.println(prodName);
		cartPage.clickOnCheckout();
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.selectCountry("Ind");
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "chakrireddy170@gmail.com", "Chakri@143", "ADIDAS ORIGINAL" },
				{ "pullalarevuchakradharreddy@gmail.com", "Chakri@111", "ZARA COAT 3" } };
	}

}
