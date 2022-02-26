package CucumberTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\001AIH744\\eclipse-workspace\\FST_B22_Selenium_Project\\Features",
    glue = {"C:\\Users\\001AIH744\\eclipse-workspace\\FST_B22_Selenium_Project\\src\\main\\java\\StepDefinations"},
    tags = "@activity1_1"
)

public class ActivitiesRunner {
    //empty
}