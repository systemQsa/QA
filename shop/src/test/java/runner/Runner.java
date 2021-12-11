package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)@CucumberOptions(
        features = "src/test/resources",
        glue = {"steps", "hooks"},
        plugin = {"json:build/cucumber.json",
                "html:build/site/cucumber-pretty"},
        stepNotifications = true)
public class Runner {
}