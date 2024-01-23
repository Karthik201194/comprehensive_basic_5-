package Maven.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class notXpath {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://autify.com/");
		
		WebElement WhyAutify = driver.findElement(By.xpath( "(//a[text()=\"Why Autify\"])[1]"));
		WhyAutify.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String ExpectedTitle_1 = "Why Autify";
		String ActualTitle_1 = driver.getTitle();
		System.out.println(ActualTitle_1);
		if(ExpectedTitle_1.equals(ActualTitle_1)) {
			System.out.println(ActualTitle_1 + " Matches with the " + ExpectedTitle_1);
		}else {
			System.out.println("Title1 didnt match");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement Pricing = driver.findElement(By.xpath( "(//a[text()=\"Pricing\"])[1]"));
		Pricing.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String ExpectedTitle_2 = "Pricing";
		String ActualTitle_2 = driver.getTitle();
		System.out.println(ActualTitle_2);
		if(ExpectedTitle_1.equals(ActualTitle_2)) {
			System.out.println(ActualTitle_2 + " Matches with the " + ExpectedTitle_2);
		}else {
			System.out.println("Title2 didnt match");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		WebElement Webinars = driver.findElement(By.xpath( "(//a[text()=\"Webinars\"])[1]"));
		Webinars.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String ExpectedTitle_3 = "Webinars";
		String ActualTitle_3 = driver.getTitle();
		System.out.println(ActualTitle_3);
		if(ExpectedTitle_1.equals(ActualTitle_3)) {
			System.out.println(ActualTitle_3 + " Matches with the " + ExpectedTitle_3);
		}else {
			System.out.println("Title3 didnt match");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
}
