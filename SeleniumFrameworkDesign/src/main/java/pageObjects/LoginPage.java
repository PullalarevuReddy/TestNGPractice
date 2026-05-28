package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class LoginPage extends AbstractComponents {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="userEmail")
	WebElement emailCheckBox;
	
	@FindBy(id="userPassword")
	WebElement passwordCheckBox;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	public void launchApp(String email, String password) {
		emailCheckBox.sendKeys(email);
		passwordCheckBox.sendKeys(password);
		loginButton.click();
		
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}

}
