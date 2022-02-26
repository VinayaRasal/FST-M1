package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertTestSteps {
	WebDriver driver;
	WebDriverWait wait;
	Alert alert;

	// @SuppressWarnings("deprecation")
	@Given("^User is on the page$")
	public void user_is_on_the_page() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/javascript-alerts");

	}

	@When("^User clicks the Simple Alert button$")
	public void user_clicks_the_simple_alert_button() {
		// clicks on simple alert
		driver.findElement(By.id("simple")).click();
		System.out.println("User clicked on simple button");

	}

	@Then("^Alert opens$")
	public void alert_opens() {
		alert = driver.switchTo().alert();
	}

	// When User clicks the Confirm Alert button
	@When("^User clicks the Confirm Alert button$")
	public void user_clicks_the_Confirm_alert_button() {
		driver.findElement(By.id("confirm")).click();
		System.out.println("User clicked on Confirm button");

	}
	
	@Then("^Write a custom message in it$")
	public void write_a_custom_message_in_it() {
		driver.switchTo().alert().sendKeys("Hello");
	    
	}


	// When User clicks the Confirm Alert button
	@When("^User clicks the Prompt Alert button$")
	public void user_clicks_the_prompt_alert_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("prompt")).click();

	}

	@Then("^Read the text from it and print it$")
	public void read_the_text_from_it_and_print_it() throws InterruptedException {
		Thread.sleep(5000);
		alert = driver.switchTo().alert();
		System.out.println("Read the text from alert" + alert.getText());

	}

	@Then("^Close the alert$")
	public void close_the_alert() throws InterruptedException {
        Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}

	@Then("^Read the result text$")
	public void read_the_result_text() throws InterruptedException {
		alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("Read the text from alert" + alert.getText());
	}
	
	@Then("^Close the alert with Cancel$")
	public void close_the_alert_with_cancel() throws InterruptedException {
		Thread.sleep(5000);
	     driver.switchTo().alert().dismiss();
	     System.out.println("Close the alert with Cancel");  
	}

	@Then("^Close Browser$")
	public void close_browser() {

		driver.quit();
	}

}
