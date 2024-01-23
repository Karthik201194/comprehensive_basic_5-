package Maven.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://autify.com/");
		
		// Array of XPath expressions for each link
        String[] xPathExpressions = {
        	    "(//a[text()=\"Why Autify\"])[1]",
                "(//a[text()=\"Pricing\"])[1]",
                "(//a[text()=\"Webinars\"])[1]",
                "(//a[text()=\"Resources\"])[1]"
        };

        // Loop through each link using XPath
        for (int i = 0; i < xPathExpressions.length; i++) {
            // Find the link element by its XPath expression
            WebElement linkElement = driver.findElement(By.xpath(xPathExpressions[i]));

            // Verify if the link is displayed
            if (linkElement.isDisplayed()) {
                System.out.println("Link '" + linkElement.getText() + "' is displayed.");

                // Verify if the link text is as expected
                if (linkElement.getText().equals("Link" + (i + 1))) {
                    System.out.println("Link text is correct for '" + linkElement.getText() + "'.");
                    
                    // Perform additional verifications or actions as needed

                } else {
                    System.out.println("Link text is incorrect for '" + linkElement.getText() + "'.");
                }
            } else {
                System.out.println("Link '" + linkElement.getText() + "' is not displayed.");
            }
        }
		
				
       String homepage_url = driver.getWindowHandle();
        
        WebElement startFreeTrail = driver.findElement(By.xpath("(//a[text()=\"Start Free Trial\"])[1]"));
        WebElement signIn = driver.findElement(By.xpath("(//a[text()=\"Sign in\"])[1]"));
        
        // Check if the start free trial button is enabled
        if (startFreeTrail.isEnabled()) {
            System.out.println("startFreeTrail Button is enabled.");

            // Click the first button
            startFreeTrail.click();
            System.out.println("startFreeTrail Button clicked.");
            
            // switching back to homepage
            driver.switchTo().window(homepage_url);
           System.out.println("switched back to homepage");
            
            // Check if the signIn button is enabled
            if (signIn.isEnabled()) {
                System.out.println("signIn Button is enabled.");

                // Click the first button
                signIn.click();
                System.out.println("signIn Button clicked.");
                
                // switching back to homepage
                driver.switchTo().window(homepage_url);
                System.out.println("switched back to homepage");
		driver.quit();
	}

}
}
}

