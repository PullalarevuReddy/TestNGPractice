package NewFramewrok.firstFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.LoginPage;
import pageObjects.ProductCatalogPage;
import testComponents.BaseTest;

public class StandaloneTest extends BaseTest {
	@Test
	public void launchApplication() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String productName = "ADIDAS ORIGINAL";
		String countryName = "India";
		//LoginPage loginPage = launchApp();
		loginPage.loginApp("chakrireddy170@gmail.com", "Chakri@143");
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
}
