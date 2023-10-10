package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "  @SmokeTest",
        features = {"src/test/java/FeatureFiles/US01_Register.feature"},
        glue = "StepDefinitions",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
