//Goal: Navigate to the “All Courses” page and count the number of courses

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



public class Activity7 {
    WebDriver driver;
  
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
    	//Find the navigation bar
    	List<WebElement> menu = driver.findElements(By.cssSelector("ul#primary-menu li"));

    	System.out.println("Total number of Menu Options available at Top Navigation bar are: " + menu.size() );    	int i = 0;
    	
    	for(WebElement e : menu) {
    	    if (e.getText().equals("All Courses")){
    	    	e.click();
    	    	break;
    	    }
    	}
    	
         // Find and validate page title
          
          String title = driver.getTitle();
          
          //Print the title of the page
          System.out.println("Page title is: " + title);
              
              //Assertion for page title
          Assert.assertEquals("All Courses – Alchemy LMS", title);
         
          // Print the number of courses on the page.

          List<WebElement> courses = driver.findElements(By.cssSelector("div.caption h3.entry-title"));
        
          System.out.println("Total number of Courses are: " + courses.size() );
     
          
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}