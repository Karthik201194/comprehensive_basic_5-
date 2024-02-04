package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {
	public static WebDriver driver;
	
@FindBy(xpath = "//input[@id=\"user-name\"]")
private WebElement userName;

@FindBy (xpath = "//input[@id=\"password\"]")
private WebElement password;

@FindBy(xpath = "//input[@id=\"login-button\"]")
private WebElement loginButton;

public FirstPage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}
public static WebDriver getDriver() {
	return driver;
}

public WebElement getUserName() {
	return userName;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginButton() {
	return loginButton;
}

}
