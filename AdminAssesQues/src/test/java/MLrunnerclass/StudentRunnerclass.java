package MLrunnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "FeatureFiles/studentlogin.feature", glue = "MLStepDefinition", dryRun = false, monochrome = true)

public class StudentRunnerclass {

		// it should combine the feature file and the step definition
		// define runner



}
