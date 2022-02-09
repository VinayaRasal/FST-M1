//Goal: Navigate to a particular lesson and complete it.

package TestNGtests;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Activity9 {
    WebDriver driver;
  
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
    	// Login
    	driver.findElement(By.cssSelector("li#menu-item-1507")).click();
    	driver.findElement(By.cssSelector("div.learndash-wrapper a.ld-login")).click();
    	driver.findElement(By.cssSelector("input#user_login")).sendKeys("root");
        driver.findElement(By.cssSelector("input#user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.cssSelector("p.login-submit")).click();
        
    	//Click on all courses menu option
    	driver.findElement(By.cssSelector("li#menu-item-1508 a")).click();
    	   	
    	
         // Find and validate page title
          
          String title = driver.getTitle();
          System.out.println("Page title is: " + title);
          Assert.assertEquals("All Courses – Alchemy LMS", title);
          
        // Click on the Email Marketing Strategy see more button
          List<WebElement> courses = driver.findElements(By.cssSelector("p.ld_course_grid_button a.btn-primary"));
        courses.get(1).click();
        // Click on the lesson
        driver.findElement(By.cssSelector("div.ld-item-title")).click();
       // Click Mark complete button if available 
        boolean isPresent = driver.findElements(By.cssSelector(" input.learndash_mark_complete_button")).size() > 0 ;
        if(isPresent)
        {
        	driver.findElement(By.cssSelector(" input.learndash_mark_complete_button")).click();  
        } else { System.out.println("Mark Complete button not available"); }
        

         
    }
    
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

   

}