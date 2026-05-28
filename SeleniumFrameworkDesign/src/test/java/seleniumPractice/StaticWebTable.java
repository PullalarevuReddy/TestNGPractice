package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://blazedemo.com/");
		WebElement depDropDOwn = driver.findElement(By.xpath("//select[@class='form-inline'][1]"));
		Select sel = new Select(depDropDOwn);
		sel.selectByIndex(3);
		WebElement desDropDown = driver.findElement(By.xpath("//select[@class='form-inline'][2]"));
		Select sel1 = new Select(desDropDown);
		sel1.selectByIndex(5);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String leastPrice = driver.findElement(By.xpath("//tr[3]//td[6]")).getText();
		List<WebElement> listOfRows = driver.findElements(By.xpath("//tr"));
		for (int r = 1; r <= listOfRows.size(); r++) {
			WebElement price = driver.findElement(By.xpath("//tr[" + r + "]//td[6]"));
			String value = price.getText();
			System.out.println(value);
			if (leastPrice.equalsIgnoreCase(value)) {
				driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
				break;
			}

		}

	}

}
