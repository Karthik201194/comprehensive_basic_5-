package Maven.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Initialize WebDriver and open the website
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://autify.com/");
    }

    @DataProvider(name = "linkData")
    public Object[][] linkData() {
        return new Object[][]{
                {"(//a[text()=\"Why Autify\"])[1]", "Why Autify"},
                {"(//a[text()=\"Pricing\"])[1]", "Pricing"},
                {"(//a[text()=\"Webinars\"])[1]", "Webinars"},
                {"(//a[text()=\"Resources\"])[1]", "Resources"}
        };
    }

    @Test(dataProvider = "linkData")
    public void testLinks(String xPathExpression, String expectedLinkText) {
        WebElement linkElement = driver.findElement(By.xpath(xPathExpression));

        Assert.assertTrue(linkElement.isDisplayed(), "Link '" + expectedLinkText + "' is displayed.");

        Assert.assertEquals(linkElement.getText(), expectedLinkText,
                "Link text is correct for '" + expectedLinkText + "'.");

        // Additional verifications or actions can be performed here
    }

    @Test
    public void testStartFreeTrialAndSignInButtons() {
        String homepageUrl = driver.getWindowHandle();

        WebElement startFreeTrial = driver.findElement(By.xpath("(//a[text()=\"Start Free Trial\"])[1]"));
        WebElement signIn = driver.findElement(By.xpath("(//a[text()=\"Sign in\"])[1]"));

        Assert.assertTrue(startFreeTrial.isEnabled(), "startFreeTrail Button is enabled.");

        startFreeTrial.click();
        driver.switchTo().window(homepageUrl);
        System.out.println("switched back to homepage");

        Assert.assertTrue(signIn.isEnabled(), "signIn Button is enabled.");

        signIn.click();
        driver.switchTo().window(homepageUrl);
        System.out.println("switched back to homepage");
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

