package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "junit:target/cucumber.xml"
        , "rerun:target/failed.txt","pretty"}
        , features="src/test/java/features/Dashboard.feature"
        , glue="steps"
        , tags="@progression"
        , dryRun = false
        , monochrome=true
        , strict = true
)

public class ProgressionRunner {
}
