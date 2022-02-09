//Goal: Open the website and log-in using the provided credentials.

package TestNGtests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Activity6 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
    	 //Find and click on My Accounts link
    	WebElement myAccountLnk = driver.findElement(By.cssSelector("li#menu-item-1507"));
          myAccountLnk.click();
          
         // Find and validate page title
          
          String title = driver.getTitle();
          
          //Print the title of the page
          System.out.println("Page title is: " + title);
              
              //Assertion for page title
          Assert.assertEquals("My Account – Alchemy LMS", title);
         
          // Click on login button
          driver.findElement(By.cssSelector("div.learndash-wrapper a.ld-login")).click();
    	
       // Login with valid credentials
          driver.findElement(By.cssSelector("input#user_login")).sendKeys("root");
          driver.findElement(By.cssSelector("input#user_pass")).sendKeys("pa$$w0rd");
          driver.findElement(By.cssSelector("p.login-submit")).click();
          
       // Verify page title after login
          String newTitle = driver.getTitle();
          
          //Print the title of the page
          System.out.println("Page title is: " + newTitle);
              
              //Assertion for page title
          Assert.assertEquals("My Account – Alchemy LMS", newTitle);
       // Verify username on at the top after login
        
          String user = driver.findElement(By.cssSelector("a.ab-item span.display-name")).getText();
          Assert.assertEquals(user, "root");
          
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}