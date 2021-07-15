package co.com.qvision.certificacion.demoqa.services;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;


public class BookStoreServicesService {

    public static RequestSpecification construirServicio() {
        return SerenityRest.given()
                .baseUri("https://demoqa.com/")
                .contentType("application/json")
                .header("charset", "UTF-8");
    }

    public static Response consumirServicioPost(RequestSpecification requestSpecification) {
        return requestSpecification.when().post();
    }
}
