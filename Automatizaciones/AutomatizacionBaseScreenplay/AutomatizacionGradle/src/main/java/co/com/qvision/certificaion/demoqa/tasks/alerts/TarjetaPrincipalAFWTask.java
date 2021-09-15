package co.com.qvision.certificaion.demoqa.tasks.alerts;

import co.com.qvision.certificaion.demoqa.interactions.alerts.TarjetaPrincipalAFWInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TarjetaPrincipalAFWTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TarjetaPrincipalAFWInteraction.tarjetaPrincipalAFWInteraction()
        );
    }

    public static TarjetaPrincipalAFWTask tarjetaPrincipalAFWTask() {
        return Tasks.instrumented(TarjetaPrincipalAFWTask.class);
    }
}
