package co.com.qvision.certificaion.demoqa.tasks.elements.textbox;

import co.com.qvision.certificaion.demoqa.interactions.elements.textbox.DiligenciarCamposTextBoxInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.elements.textbox.DiligenciarCamposTextBoxInteraction.diligenciarCamposTextBoxInteraction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarCamposTextBoxTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DiligenciarCamposTextBoxInteraction.diligenciarCamposTextBoxInteraction()
        );
    }

    public static DiligenciarCamposTextBoxTask diligenciarCamposTextBoxTask() {
        return instrumented(DiligenciarCamposTextBoxTask.class);
    }
}
