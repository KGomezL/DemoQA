package co.com.qvision.certificacion.demoqa.runners.forms;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/forms/practice_form.feature",
        glue = {"co.com.qvision.certificacion.demoqa.stepdefinitions.forms",
                "co.com.qvision.certificacion.demoqa.stepdefinitions.datatabletypes",
                "co.com.qvision.certificacion.demoqa.stepdefinitions.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@practiceForm"
)
public class PracticeFormRunner {
}
