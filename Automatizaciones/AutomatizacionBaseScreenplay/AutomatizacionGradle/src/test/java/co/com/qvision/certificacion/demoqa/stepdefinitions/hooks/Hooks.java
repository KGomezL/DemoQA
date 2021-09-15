package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

    //Practice Forms
    @Before(value = "@practiceForm", order = 0)
    public void abrirNavegador() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Mateo");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
    }

    //Book Store
//    @Before(value = "@bookStoreServices", order = 1)
//    public void abrirNavegador() {
//        OnStage.setTheStage(new OnlineCast());
//        OnStage.theActorCalled("Armando");
//        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
//    }
//    //Radio Buttton
//    @Before(value = "@radioButton", order = 1)
//    public void abrirNavegador() {
//        OnStage.setTheStage(new OnlineCast());
//        OnStage.theActorCalled("Armando");
//        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
//    }

//    //Upload y Down
//    @Before(value = "@uploadDown", order = 1)
//    public void abrirNavegador() {
//        OnStage.setTheStage(new OnlineCast());
//        OnStage.theActorCalled("Armando");
//        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
//    }


//    //Alerts
//    @Before(value = "@alerts", order = 0)
//    public void abrirNavegador() {
//        OnStage.setTheStage(new OnlineCast());
//        OnStage.theActorCalled("Armando");
//        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
//    }//
//    //

}
