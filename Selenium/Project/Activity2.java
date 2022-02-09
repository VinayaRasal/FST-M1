//Goal: Read the heading of the website and verify the text

package TestNGtests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Activity2 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
    	 //Find the Webpage Heading 
        WebElement pageHeader= driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
                    
        //Print title
        System.out.println("Webpage header is: " + pageHeader.getText());
        
       Assert.assertEquals("Learn from Industry Experts", pageHeader.getText());
       
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}