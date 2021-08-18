package provakeeggo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", 
		glue = "provakeeggo.steps", 
		tags = "@all",
		dryRun = false, 
		monochrome = true, 
		plugin = { "pretty", "json:target/cucumber-report.json","html:target/cucumber-report.html" }

)

public class Executa {

}
