package co.com.qvision.certificacion.demoqa.stepdefinitions.services;

import co.com.qvision.certificacion.demoqa.models.services.request.DataServiceModel;
import co.com.qvision.certificacion.demoqa.models.services.responses.BodyUserResponse;
import co.com.qvision.certificacion.demoqa.steps.services.BookStoreServicesSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BookStoreServicesStepDefinitions {

    @Steps
    BookStoreServicesSteps bookStoreServicesSteps;

    @Dado("que quiero consumir el servicio de registro")
    public void queQuieroConsumirElServicioDeRegistro() {
        bookStoreServicesSteps.prepararServicioDemoQA();
    }

    @Cuando("consumo el servicio")
    public void consumoElServicio(DataServiceModel dataServiceModel) {
        bookStoreServicesSteps.consumirServicioUser(dataServiceModel);
    }

    @Entonces("valido que en la respuesta el usuario exista")
    public void validoQueEnLaRespuestaElUsuarioExista(BodyUserResponse bodyUserResponse) {
        bookStoreServicesSteps.validarRespuestaUser(bodyUserResponse);
    }
}
