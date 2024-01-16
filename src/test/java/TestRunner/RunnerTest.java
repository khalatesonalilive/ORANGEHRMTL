package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features= {"AllFeaturesFile"},
		glue= {"Steps"},
		dryRun=true,
		monochrome=true
		
		)



public class RunnerTest extends AbstractTestNGCucumberTests {

}
