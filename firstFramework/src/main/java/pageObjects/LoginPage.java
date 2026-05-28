package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class LoginPage  extends AbstractComponent{
	WebDriver driver;
	
   @FindBy(id="userEmail")
   WebElement userEmail;
   
   @FindBy(id="userPassword")
   WebElement userPassword;
   
   @FindBy(id="login")
   WebElement button;
   @FindBy(css="[class*='flyInOut']")
   WebElement errorMessage;
   
   public LoginPage(WebDriver driver) {
	   super(driver);
	   this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void loginApp(String mail, String password) {
	   userEmail.sendKeys(mail);
	   userPassword.sendKeys(password);
	   button.click();
	   
   }
public String getErrorMessage() {
	waitForWebElementToAppear(errorMessage);
	return errorMessage.getText();
}
public void goTo() {
	driver.get("https://rahulshettyacademy.com/client");
}
}
