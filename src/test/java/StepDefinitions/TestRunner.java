package StepDefinitions;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/login.feature",
        glue = {"StepDefinitions"},
        monochrome = true,
        dryRun = false,
        tags = "@Test4",
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"
        })
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
}

//extends AbstractTestNGCucumberTests