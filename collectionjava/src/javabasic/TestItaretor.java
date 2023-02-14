package javabasic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestItaretor {

	public static void main(String[] args) {
 //Find all the URL or Link in page 
		// Create WebDriver instance and open the website.
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");

		String url = "";
		List<WebElement> allURLs = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the Wb Page: " + allURLs.size());

		// We will iterate through the list and will check the elements in the list.
		//Iterator<WebElement> iterator = allURLs.iterator();
	//	while (iterator.hasNext()) {
			//url = iterator.next().getText();
			//System.out.println(url);
		}

		// Close the browser session
		//driver.quit();
	}

