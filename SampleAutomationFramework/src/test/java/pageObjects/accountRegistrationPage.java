package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountRegistrationPage extends BasePage{
	WebDriver driver;
	public accountRegistrationPage(WebDriver driver) {
			super(driver);
		
		
	}
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myAccountButton;
	
	@FindBy(id="input-firstname")
	WebElement firstName;
	
	@FindBy(id="input-lastname")
	WebElement lastName;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-telephone")
	WebElement phoneNumber;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(id="input-confirm")
	WebElement cofirmPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkbox;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuButton;
	
	public void setFirstName(String firstNam) {
		firstName.sendKeys(firstNam);
	}
	public void setLastName(String last) {
		lastName.sendKeys(last);
	}
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	public void setPhoneNumber(String number) {
		phoneNumber.sendKeys(number);
	}
	public void setPasword(String pass) {
		password.sendKeys(pass);
	}
	public void setConfirmPassword(String cpwd) {
		cofirmPassword.sendKeys(cpwd);
		checkbox.click();
		continuButton.click();
		
		
	}
	
	

}
