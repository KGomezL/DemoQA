package co.com.qvision.certificaion.demoqa.tasks.services;

import co.com.qvision.certificaion.demoqa.interactions.services.PrepararServiciointeraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class PrepararServicioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PrepararServiciointeraction.prepararServiciointeraction()
        );
    }

    public static PrepararServicioTask prepararServicioTask() {
        return Tasks.instrumented(PrepararServicioTask.class);
    }
}
