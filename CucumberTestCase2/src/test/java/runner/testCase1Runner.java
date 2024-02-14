package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\testcase1.feature",glue = "stepDefinations",plugin = {"pretty","html:target/testCase1-reports.html"})

public class testCase1Runner extends AbstractTestNGCucumberTests {

}
