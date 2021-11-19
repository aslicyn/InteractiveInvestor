package ii.co.uk.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
        /*
         takes the only failed scenarios from file where we store failed scenarios
          which is  inside of target folder...
         */
        features = "@target/rerun.txt",
        glue="ii/co/uk/step_definitions"

)
public class FailedTestRunner {


}
