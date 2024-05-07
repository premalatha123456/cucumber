package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles/Customer.feature"},monochrome = true,glue= {"stepDefinations"},plugin= {"pretty","html:target/report.html"},dryRun = false)

public class Runner {

}
