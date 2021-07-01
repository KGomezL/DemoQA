package co.com.qvision.certificaion.demoqa.interactions.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.textbox.TextBoxPageUI.*;

public class DiligenciarEmailTextBoxinteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("armando@casas.com")
                        .into(CAMPO_EMAIL),
                Scroll.to(CAMPO_EMAIL),
                Click.on(BOTON_SUBMIT)
        );
    }

    public static DiligenciarEmailTextBoxinteraction diligenciarEmailTextBoxinteraction() {
        return Tasks.instrumented(DiligenciarEmailTextBoxinteraction.class);
    }
}
