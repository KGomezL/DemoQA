package co.com.qvision.certificaion.demoqa.interactions.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.textbox.TextBoxPageUI.CAMPO_FULL_NAME;

public class DiligenciarFullNameTextBoxInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("Armando Casas")
                        .into(CAMPO_FULL_NAME)
        );
    }

    public static DiligenciarFullNameTextBoxInteraction diligenciarFullNameTextBoxInteraction() {
        return Tasks.instrumented(DiligenciarFullNameTextBoxInteraction.class);
    }
}
