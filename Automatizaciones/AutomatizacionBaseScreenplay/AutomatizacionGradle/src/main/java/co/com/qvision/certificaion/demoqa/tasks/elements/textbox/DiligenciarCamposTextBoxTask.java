package co.com.qvision.certificaion.demoqa.tasks.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.elements.textbox.DiligenciarCamposTextBoxInteraction.diligenciarCamposTextBoxInteraction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarCamposTextBoxTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                diligenciarCamposTextBoxInteraction()
        );
    }

    public DiligenciarCamposTextBoxTask diligenciarCamposTextBoxTask() {
        return instrumented(DiligenciarCamposTextBoxTask.class);
    }
}
