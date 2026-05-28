package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingLinksOnThePage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--Headless");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//System.out.println(links);
		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");
			// now is in string format we have to covert it into URL format
			if (linkURL == null || linkURL.isEmpty()) {
				System.out.println("we cannot validate the URL ");
				continue;
			}
			URL url = new URL(linkURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			int responseCode = conn.getResponseCode();
			if (responseCode >= 400) {
				System.out.println(url + "Link is broken with Response code " + "" + responseCode);

			} else {
				System.out.println(url + "Link is not broken with response code " + " " + responseCode);
			}
		}
		driver.close();

	}
}
