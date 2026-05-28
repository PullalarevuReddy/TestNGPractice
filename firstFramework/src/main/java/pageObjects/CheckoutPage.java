package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement countryTextBox;
	
	@FindBy(xpath="//button[@class='ta-item list-group-item ng-star-inserted']")
	List<WebElement> countriesList;
	
	
	public void selectCountry(String countryName) {
		countryTextBox.sendKeys(countryName);
		for (WebElement country : countriesList) {
			if (country.getText().equalsIgnoreCase(countryName)) {
				country.click();
				break;
			}
		}
	}

}
