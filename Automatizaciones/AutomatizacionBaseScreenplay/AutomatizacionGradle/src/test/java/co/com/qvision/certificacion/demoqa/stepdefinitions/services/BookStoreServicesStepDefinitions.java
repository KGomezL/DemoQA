package co.com.qvision.certificacion.demoqa.stepdefinitions.services;

import co.com.qvision.certificaion.demoqa.tasks.services.PrepararServicioTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class BookStoreServicesStepDefinitions {

    @Dado("que quiero consumir el servicio de registro")
    public void queQuieroConsumirElServicioDeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PrepararServicioTask.prepararServicioTask()
        );

    }

    @Cuando("consumo el servicio")
    public void consumoElServicio() {

    }

    @Entonces("valido que en la respuesta el usuario exista")
    public void validoQueEnLaRespuestaElUsuarioExista() {
        OnStage.theActorInTheSpotlight().should(seeThatResponse("Descripcion:",
                response -> response.statusCode(406)));
    }
}
