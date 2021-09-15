package co.com.qvision.certificaion.demoqa.tasks.elements.radiobutton;

import co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton.VisualizarEleccionInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class VisualizarEleccionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                VisualizarEleccionInteraction.visualizarEleccionInteraction()

        );
    }

    public static VisualizarEleccionTask visualizarEleccionTask() {
        return Tasks.instrumented(VisualizarEleccionTask.class);
    }
}
