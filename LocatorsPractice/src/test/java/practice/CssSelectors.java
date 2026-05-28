package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("chakrireddy170@gmail.com");
		driver.findElement(By.cssSelector("input[id='userPassword']")).sendKeys("Chakri@1234");
		driver.findElement(By.cssSelector(".btn.btn-block.login-btn")).click();
		Thread.sleep(1000);
		List<WebElement> productList = driver.findElements(By.cssSelector(".mb-3"));
		System.out.println(productList.size());
		for (WebElement product : productList) {
			String prod = product.findElement(By.cssSelector("b")).getText();
			if (prod.equalsIgnoreCase("ZARA COAT 3")) {
				driver.findElement(By.cssSelector(".btn.w-10.rounded")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector(".btn.btn-custom[routerlink='/dashboard/cart']")).click();
			}

		}
		// driver.close();

	}

}
