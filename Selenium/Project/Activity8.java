//Goal: Navigate to the “Contact Us” page and complete the form.

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



public class Activity8 {
    WebDriver driver;
  
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
    	//Click on contact menu option
    	driver.findElement(By.cssSelector("li#menu-item-1506 a")).click();
    	   	
    	
         // Find and validate page title
          
          String title = driver.getTitle();
          
          //Print the title of the page
          System.out.println("Page title is: " + title);
              
              //Assertion for page title
          Assert.assertEquals("Contact – Alchemy LMS", title);
         
          //Fill the form details
          driver.findElement(By.cssSelector("input#wpforms-8-field_0")).sendKeys("Vinaya");
          driver.findElement(By.cssSelector("input#wpforms-8-field_1")).sendKeys("vinaya.rasal1@ibm.com");
          driver.findElement(By.cssSelector("input#wpforms-8-field_3")).sendKeys("TestSubject");
          driver.findElement(By.cssSelector("textarea#wpforms-8-field_2")).sendKeys("Test Message");
          // Click send Message button
          driver.findElement(By.cssSelector("button.wpforms-submit")).click();
          //Verify success message
          String message= driver.findElement(By.cssSelector("div#wpforms-confirmation-8 p")).getText();
          System.out.println(message);
         // Verify success message 
          Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly.", message);
          
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}