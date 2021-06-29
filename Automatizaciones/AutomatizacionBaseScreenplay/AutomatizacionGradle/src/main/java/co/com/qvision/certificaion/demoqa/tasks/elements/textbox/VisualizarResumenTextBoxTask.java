package co.com.qvision.certificaion.demoqa.tasks.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.qvision.certificaion.demoqa.interactions.elements.textbox.VisualizarResumenTextBoxInteraction.visualizarResumenTextBoxInteraction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VisualizarResumenTextBoxTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                visualizarResumenTextBoxInteraction()
        );
    }

    public static VisualizarResumenTextBoxTask visualizarResumenTextBoxTask() {
        return instrumented(VisualizarResumenTextBoxTask.class);
    }
}
