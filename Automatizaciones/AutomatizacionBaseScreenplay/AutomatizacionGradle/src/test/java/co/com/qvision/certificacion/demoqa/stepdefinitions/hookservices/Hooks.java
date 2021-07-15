package co.com.qvision.certificacion.demoqa.stepdefinitions.hookservices;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

    //Book Store Services
    @Before(value = "@servicios", order = 0)
    public void habilitarServicio() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Armando");
        theActorInTheSpotlight().whoCan(CallAnApi.at("https://demoqa.com/"));
    }
}
