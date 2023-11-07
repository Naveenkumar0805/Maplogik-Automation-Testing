package MLrunnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "FeatureFiles/CLapproveinternship.feature", glue = "MLStepDefinition", dryRun = false, monochrome = true)

public class CLapproveintern_Runnerclass {

}
