package cucumber;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import com.cucumber.listener.Reporter;

//this is a cucumber annotation dictating the cucumber runner
@RunWith(Cucumber.class)
//this is how we want the results formatted. The only customizable line, different formats can be added or removed. I�ve included the most common ones for convenience
@CucumberOptions(
		//features= {"//src/test/resources/featu res/login.feature"},
				features = "src/test/resources/features",
		glue={"stepDefinitions"},
		dryRun=false,
		plugin= {"pretty" ,"html:test-output.html"},
			//	plugin={"com.cucumber.listener.ExtentCucumberFormatter:"},
		monochrome=true,
		tags="@login"
		)


class TestRunner {

}
