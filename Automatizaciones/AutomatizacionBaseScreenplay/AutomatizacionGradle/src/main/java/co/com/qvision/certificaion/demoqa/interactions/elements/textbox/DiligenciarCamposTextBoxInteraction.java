package co.com.qvision.certificaion.demoqa.interactions.elements.textbox;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.textbox.TextBoxPageUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarCamposTextBoxInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.keyValues("Armando Casas")
                        .into(CAMPO_FULL_NAME),
                Enter.keyValues("armando@casas.com")
                        .into(CAMPO_EMAIL),
                Enter.keyValues("Calle 7")
                        .into(CAMPO_CURRENT_ADD),
                Enter.keyValues("Calle 7")
                        .into(CAMPO_PERMANENT_ADD)
        );

    }

    public static DiligenciarCamposTextBoxInteraction diligenciarCamposTextBoxInteraction() {
        return instrumented(DiligenciarCamposTextBoxInteraction.class);
    }
}
