package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
 * In order to run a specific feature, insert file path into "" in features option
 * and ensure that the proper feature is tagged with an annotated @progression tag
 * To run test cases in progress
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "junit:target/cucumber.xml"
        , "rerun:target/failed.txt","pretty"}
        , features="src/test/java/features/STK-2367.feature"
        , glue="steps"
        , tags="@progression"
        , dryRun = true
        , monochrome= true
        , strict = true
)

public class ProgressionRunner {
}
