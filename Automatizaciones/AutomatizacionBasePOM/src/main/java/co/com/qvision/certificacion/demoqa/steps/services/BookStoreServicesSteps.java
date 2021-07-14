package co.com.qvision.certificacion.demoqa.steps.services;

import co.com.qvision.certificacion.demoqa.services.BookStoreServicesService;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.certificacion.demoqa.services.BookStoreServicesService.consumirServicioPost;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;



public class BookStoreServicesSteps {

    @Step
    public static void validarRespuestaUser() {
        Response response = Serenity.sessionVariableCalled("UserResponse");
        assertThat("El codigo de respuesta no es correcto", response.getStatusCode(),equalTo(406));
        assertThat("El cuerpo de respuesta no coincide", response.body().asString(),equalTo(
                "{\"code\":\"1204\",\"message\":\"User exists!\"}"
        ));
    }

    @Step
    public void prepararServicioDemoQA() {
        Serenity.setSessionVariable("ServiceConf").to(BookStoreServicesService.construirServicio());
    }

    @Step
    public void consumirServicioUser() {
        RequestSpecification requestSpecification = Serenity.sessionVariableCalled("ServiceConf");
        requestSpecification.basePath("Account/v1/User");
        requestSpecification.body(
                "{\n" +
                        "    \"userName\": \"Pablo\",\n" +
                        "    \"password\": \"Pa12345*\"\n" +
                        "}\n"
        ).log().body();
        Serenity.setSessionVariable("UserResponse").to(consumirServicioPost(requestSpecification));
    }
}
