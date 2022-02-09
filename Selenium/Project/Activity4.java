//Goal: Read the title of the second most popular course on the website and verify the text

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



public class Activity4 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
    	 //Find list of popular courses
    	List<WebElement> courses = driver.findElements(By.cssSelector("h3.entry-title"));
            System.out.println("Total number of populr courses in list are: " + courses.size() );
         // find second popular course
        System.out.println("Second popular Course is :"+ courses.get(1).getText());
       Assert.assertEquals("Email Marketing Strategies", courses.get(1).getText());
       
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}