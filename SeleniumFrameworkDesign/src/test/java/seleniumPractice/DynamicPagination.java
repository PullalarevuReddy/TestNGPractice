package seleniumPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicPagination {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com");
		List<WebElement> pagination = driver.findElements(By.xpath("//ul[@id='pagination']/li"));

		for (int i = 1; i <= pagination.size() - 1; i++) {
			pagination.get(i).click();
			List<WebElement> data = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));

			for (int j = 1; j <= data.size() - 1; j++) {
				String value = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+j+"]")).getText();
				System.out.println(value);
			}

			driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr/td/input[@type='checkbox'][1]")).click();

		}

	}

}
