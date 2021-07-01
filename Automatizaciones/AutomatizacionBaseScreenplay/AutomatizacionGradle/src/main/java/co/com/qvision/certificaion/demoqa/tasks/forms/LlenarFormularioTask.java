package co.com.qvision.certificaion.demoqa.tasks.forms;

import co.com.qvision.certificaion.demoqa.interactions.forms.CamposTextoInteraction;
import co.com.qvision.certificaion.demoqa.models.forms.FormData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LlenarFormularioTask implements Task {

    FormData formData;

    public LlenarFormularioTask(FormData formData) {
        this.formData = formData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("datos", formData);
        Serenity.setSessionVariable("datos").to(formData);
        actor.attemptsTo(
                CamposTextoInteraction.camposTextoInteraction()
        );

    }

    public static final LlenarFormularioTask llenarFormularioTask(FormData formData) {
        return Tasks.instrumented(LlenarFormularioTask.class, formData);
    }
}
