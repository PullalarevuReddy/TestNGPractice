package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class ProductCatalogPage extends AbstractComponent{
	WebDriver driver;

	public ProductCatalogPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".mb-3")
	List<WebElement> productList;
	By productNameList = By.xpath(".//div[@class='card-body']/h5");
	By addtoCart = By.cssSelector(".btn.w-10.rounded");
	@FindBy(css =".toast-message")
	WebElement confirmMessage;
	
	By waitToElementDisappear=By.cssSelector(".toast-message");

	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement clickOnCartButton;

	public List<WebElement> getProductList(String productName) {
		for (WebElement product : productList) {
			List<WebElement> productsName = product.findElements(productNameList);
			for (WebElement prod : productsName) {
				if (prod.getText().equalsIgnoreCase(productName)) {
					product.findElement(addtoCart).click();
					break;
				}
			}
		}
		return productList;
	}

	public String getToastMessage() {
		
		return confirmMessage.getText();
	}
	public void clickOnCart() {
		waitForElementToDisappear(waitToElementDisappear);
		clickOnCartButton.click();
		
	}

}
