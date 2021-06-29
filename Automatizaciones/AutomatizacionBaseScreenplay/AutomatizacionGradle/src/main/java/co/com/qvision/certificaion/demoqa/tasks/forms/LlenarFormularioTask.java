package co.com.qvision.certificaion.demoqa.tasks.forms;

import co.com.qvision.certificaion.demoqa.interactions.forms.CamposTextoInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LlenarFormularioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CamposTextoInteraction.camposTextoInteraction()
        );

    }

    public static final LlenarFormularioTask llenarFormularioTask() {
        return Tasks.instrumented(LlenarFormularioTask.class);
    }
}
