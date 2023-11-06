package MLrunnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "FeatureFiles/companylogin.feature", glue = "MLStepDefinition", dryRun = false, monochrome = true)

public class CLRunnerclass {

}
