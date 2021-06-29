package co.com.qvision.certificaion.demoqa.interactions.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.textbox.TextBoxPageUI.CAMPO_EMAIL;

public class DiligenciarEmailTextBoxinteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("armando@casas.com")
                        .into(CAMPO_EMAIL)
        );
    }

    public static DiligenciarEmailTextBoxinteraction diligenciarEmailTextBoxinteraction() {
        return Tasks.instrumented(DiligenciarEmailTextBoxinteraction.class);
    }
}
