package co.com.qvision.certificaion.demoqa.tasks.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalElementsInteraction.tarjetaPrincipalElementsInteraction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTextBoxTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                tarjetaPrincipalElementsInteraction()
        );
    }

    public static SeleccionarTextBoxTask menu() {
        return instrumented(SeleccionarTextBoxTask.class);
    }
}
