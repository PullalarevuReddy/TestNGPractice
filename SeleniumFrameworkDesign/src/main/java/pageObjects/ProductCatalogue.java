package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class ProductCatalogue extends AbstractComponents {
	WebDriver driver;
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".mb-3")
	List<WebElement> productList;
	
	By productBy=By.cssSelector(".mb-3");
	By cartBtn=By.cssSelector(".btn.w-10");
	
	
	public List<WebElement> getProductList() {
		waitForElementToAppear(productBy);
		for (WebElement product : productList) {
			String prod = product.getText();
			if (prod.contains("ADIDAS ORIGINAL")) {
				product.findElement(cartBtn).click();
			}
		}
		return productList;
	}

}
