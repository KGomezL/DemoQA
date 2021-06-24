package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

    @Before(value = "", order = 0)
    public void abrirNavegador() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
    }
}
