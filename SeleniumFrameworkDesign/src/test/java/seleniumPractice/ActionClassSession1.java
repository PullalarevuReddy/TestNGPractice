package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassSession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions a = new Actions(driver);
		WebElement name = driver.findElement(By.id("name"));
		a.moveToElement(name).click().keyDown(Keys.SHIFT).sendKeys("chakri").doubleClick().build().perform();
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		a.moveToElement(mouseHover).build().perform();
		//driver.close();

	}

}
