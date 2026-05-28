package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingItemsToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> totalProducts = driver.findElements(By.cssSelector(".product"));
	    for(WebElement product:totalProducts) {
	    	String prod = product.findElement(By.cssSelector("h4.product-name")).getText();
	    	//System.out.println(prod.getText
	    	//System.out.println(prod);
	    	
	    	if(prod.contains("Cucumber")) {
	    		System.out.println(prod);
	    		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	    	}
	    }

	}

}
