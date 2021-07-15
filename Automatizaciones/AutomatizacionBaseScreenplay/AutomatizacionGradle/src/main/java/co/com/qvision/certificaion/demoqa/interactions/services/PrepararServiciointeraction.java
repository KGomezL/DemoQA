package co.com.qvision.certificaion.demoqa.interactions.services;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PrepararServiciointeraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("Account/v1/User").withRequest(request -> request.contentType("application/json").body(
                        "{\n" +
                                "  \"userName\": \"Pablo Pa\",\n" +
                                "  \"password\": \"Pa12345*\"\n" +
                        "}"
                ))
        );
    }

    public static PrepararServiciointeraction prepararServiciointeraction() {
        return Tasks.instrumented(PrepararServiciointeraction.class);
    }
}
