package co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.radiobutton.RadioButtonPage.HEADER;

public class VisualizarEleccionInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HEADER)
        );
    }

    public static VisualizarEleccionInteraction visualizarEleccionInteraction() {
        return Tasks.instrumented(VisualizarEleccionInteraction.class);
    }
}
