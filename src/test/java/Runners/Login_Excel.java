package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US01_ExcelData.feature"},
        glue = "StepDefinitions",
        plugin = {"html:target/site/cucumber-pretty.html"}
)

public class Login_Excel extends AbstractTestNGCucumberTests {
}
