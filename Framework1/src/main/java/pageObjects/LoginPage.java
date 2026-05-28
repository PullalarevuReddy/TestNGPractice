package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractCompponents.Utility;

public class LoginPage extends Utility{
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement button;
	
	@FindBy(css=".ng-tns-c4-4.toast-message.ng-star-inserted")
	WebElement toastMessage;
	
	
	public void launchApplication(String mail, String pass) {
		email.sendKeys(mail);
		password.sendKeys(pass);
		button.click();
		//waitForElementToAppear();
		
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
	public String errorMessage() {
		String message = toastMessage.getText();
		return message;
	}

	
	

}
