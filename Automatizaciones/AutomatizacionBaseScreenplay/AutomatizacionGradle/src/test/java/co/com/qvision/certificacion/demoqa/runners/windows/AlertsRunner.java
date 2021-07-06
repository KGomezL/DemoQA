package co.com.qvision.certificacion.demoqa.runners.windows;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/windows/alerts.feature",
        glue = "co.com.qvision.certificacion.demoqa.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
        //tags = "@tags"
)
public class AlertsRunner {
}
