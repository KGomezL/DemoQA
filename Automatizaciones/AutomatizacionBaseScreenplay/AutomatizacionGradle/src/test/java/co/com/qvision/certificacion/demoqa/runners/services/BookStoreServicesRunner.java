package co.com.qvision.certificacion.demoqa.runners.services;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/services/book_store_services.feature",
        glue = {"co.com.qvision.certificacion.demoqa.stepdefinitions.services",
                "co.com.qvision.certificacion.demoqa.stepdefinitions.datatabletypes",
                "co.com.qvision.certificacion.demoqa.stepdefinitions.hookservices"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@servicios"
)
public class BookStoreServicesRunner {
}
