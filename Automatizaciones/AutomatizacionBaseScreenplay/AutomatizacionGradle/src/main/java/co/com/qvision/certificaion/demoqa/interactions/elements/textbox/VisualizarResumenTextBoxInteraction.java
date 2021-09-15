package co.com.qvision.certificaion.demoqa.interactions.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.textbox.TextBoxPageUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VisualizarResumenTextBoxInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CAMPO_FULL_NAME),
                Click.on(BOTON_SUBMIT)

        );
    }

    public static VisualizarResumenTextBoxInteraction visualizarResumenTextBoxInteraction() {
        return instrumented(VisualizarResumenTextBoxInteraction.class);
    }
}
