package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStepsActivity5 {
	WebDriver driver;
	@Given("^User is on Login page$")
	public void user_is_on_login_page() {
		 driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/login-form");
				
	   
	}
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String passsword) throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(passsword);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		System.out.println("User successfully clicked on log in page");
		
	}
	    
	@Then("^Read the page title and confirmation message$")
	public void read_the_page_title_and_confirmation_message() {
		//read the page title
		String loginTitle = driver.getTitle();
		System.out.println("Login page title::" +loginTitle);
		//Confirmation message
		String ConfMsg = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Read the confirmation message" +ConfMsg);
		
	 
	}
	@And("^Close the Browser$")
	public void close_the_browser() throws InterruptedException {
		driver.quit();
	    
	}


}
