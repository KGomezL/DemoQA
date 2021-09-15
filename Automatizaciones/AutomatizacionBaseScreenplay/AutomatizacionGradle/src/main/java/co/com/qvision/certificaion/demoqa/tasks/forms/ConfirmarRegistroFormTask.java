package co.com.qvision.certificaion.demoqa.tasks.forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.qvision.certificaion.demoqa.interactions.forms.ConfirmarRegistroFormInteraction.confirmarRegistroFormInteraction;

public class ConfirmarRegistroFormTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                confirmarRegistroFormInteraction()
        );
    }

    public static ConfirmarRegistroFormTask confirmarRegistroFormTask() {
        return Tasks.instrumented(ConfirmarRegistroFormTask.class);
    }
}
