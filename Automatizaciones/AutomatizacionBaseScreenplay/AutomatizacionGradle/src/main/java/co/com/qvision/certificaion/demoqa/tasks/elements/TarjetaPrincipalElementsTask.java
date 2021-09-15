package co.com.qvision.certificaion.demoqa.tasks.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.TarjetaPrincipalElementsInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.qvision.certificaion.demoqa.interactions.elements.TarjetaPrincipalElementsInteraction.tarjetaPrincipalElementsInteraction;

public class TarjetaPrincipalElementsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TarjetaPrincipalElementsInteraction.tarjetaPrincipalElementsInteraction()
        );
    }

    public static TarjetaPrincipalElementsTask tarjetaPrincipalElementsTask() {
        return Tasks.instrumented(TarjetaPrincipalElementsTask.class);
    }
}
