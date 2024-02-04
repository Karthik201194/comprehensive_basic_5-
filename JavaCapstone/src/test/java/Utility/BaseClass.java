package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void url(WebDriver driver , String URL) {
		driver.get(URL);	
	}

	public static void maximize(WebDriver d) {
		d.manage().window().maximize();
	}
	public static void send_keys(WebElement element , String values) {
		element.sendKeys(values);	
	}

	public static void click(WebElement element) {
		element.click();

	}
	public static void clear(WebElement element) {
		element.clear();
	}

}
