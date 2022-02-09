//Goal: Read the title of the first info box on the website and verify the text
package TestNGtests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Activity3 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
    	 //Find the infoBox title
        WebElement infoBox1 = driver.findElement(By.cssSelector("h3.uagb-ifb-title"));
                    
        //Print title
        System.out.println("Title of first info box is: " + infoBox1.getText());
        
       Assert.assertEquals("Actionable Training", infoBox1.getText());
       
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}