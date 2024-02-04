package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Modules.FirstPage;
import Utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{
	
	public static FirstPage Fir = new FirstPage(driver);

@Given("User is on the login page at {string}")
public void user_is_on_the_login_page_at(String string) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manuv\\eclipse-workspace\\JavaCapstone\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	url(driver, "https://www.saucedemo.com/");
	maximize(driver);

}

@When("User enters (.*) and (.*) and clicks Submit")
public void user_enters_and_and_clicks_submit(String username, String password) {
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
 Fir.getUserName().sendKeys(username);
 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
 Fir.getPassword().sendKeys(password);
 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
 Fir.getLoginButton().click();
}

@Then("User should see the ().* page title when he logs in using correct credentials")
public void user_should_see_the_page_title_when_he_logs_in_using_correct_credentials(String string) {
	String expectedTitle = "Swag Labs";
	String title = driver.getTitle();
	if(title.equals(expectedTitle)) {
		System.out.println("title matches");
	}else {
		System.out.println("title mismatches");
	}
}

@Then("User should see the (.*) page where error message is shouwn if he logs in using invalid credentials")
public void user_should_see_the_page_where_error_message_is_shouwn_if_he_logs_in_using_invalid_credentials(String string) {
 String message =  driver.findElement(By.linkText("Epic sadface: Username and password do not match any user in this service")).getText();
 String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
 if(message.equals(expectedMessage)) {
	 System.out.println("message matches");
 }else {
	 System.out.println("message mismatch");
 }
 driver.quit();
}
}
