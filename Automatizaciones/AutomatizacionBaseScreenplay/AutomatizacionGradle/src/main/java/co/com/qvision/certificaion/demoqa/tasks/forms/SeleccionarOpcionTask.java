package co.com.qvision.certificaion.demoqa.tasks.forms;

import co.com.qvision.certificaion.demoqa.interactions.forms.SeleccionarOpcionesInicialesInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarOpcionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarOpcionesInicialesInteraction.seleccionarOpcionesInicialesInteractions()
        );
    }

    public static SeleccionarOpcionTask seleccionarOpcionTask() {
        return Tasks.instrumented(SeleccionarOpcionTask.class);
    }
}
