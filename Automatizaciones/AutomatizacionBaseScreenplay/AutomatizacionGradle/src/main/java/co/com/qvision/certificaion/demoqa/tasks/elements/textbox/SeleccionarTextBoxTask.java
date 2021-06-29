package co.com.qvision.certificaion.demoqa.tasks.elements.textbox;

import co.com.qvision.certificaion.demoqa.interactions.elements.textbox.ElementsTextBoxInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTextBoxTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ElementsTextBoxInteraction.elementsTextBoxInteraction()
        );
    }

    public static SeleccionarTextBoxTask seleccionarTextBoxTask() {
        return instrumented(SeleccionarTextBoxTask.class);
    }
}
