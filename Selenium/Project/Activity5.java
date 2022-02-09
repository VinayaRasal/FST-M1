//Goal: Navigate to the “My Account” page on the site.

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



public class Activity5 {
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
    	
    	
       
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}