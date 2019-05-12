package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HARSH\\workspace\\CucumberModelTest\\src\\main\\java\\Features\\login.feature", 
		glue = { "stepDefination" }, // the path of the step definition files
		monochrome = true,
		strict = true, 
		dryRun = false 
	)

public class TestRunner {

}
