package co.com.qvision.certificaion.demoqa.questions.alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ValidarAlertCancelPromptQuestion implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {
        BrowseTheWeb.as(actor).waitFor(ExpectedConditions.alertIsPresent());
        String text = BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys("Armando Casas Rojas");
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();
        return text;
    }

    public static ValidarAlertCancelPromptQuestion validarAlertCancelPromptQuestion() {
        return new ValidarAlertCancelPromptQuestion();
    }
}
