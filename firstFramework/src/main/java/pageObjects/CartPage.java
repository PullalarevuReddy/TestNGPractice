package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='cartSection']//h3")
	WebElement cartProductName;
	
	@FindBy(xpath = "//li//button[@type='button']")
	WebElement checkout_Button;

	public String getCheckOutProductNames() {
		return cartProductName.getText();

	}

	public void clickOnCheckout() {
		checkout_Button.click();

	}

}
