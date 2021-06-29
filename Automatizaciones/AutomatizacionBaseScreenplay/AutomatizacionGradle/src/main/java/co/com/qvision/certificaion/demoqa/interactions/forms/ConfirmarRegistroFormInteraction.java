package co.com.qvision.certificaion.demoqa.interactions.forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.forms.FormsPage.VER_DILIGENCIADOS;

public class ConfirmarRegistroFormInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VER_DILIGENCIADOS),
                Scroll.to(VER_DILIGENCIADOS)
        );
    }

    public static ConfirmarRegistroFormInteraction confirmarRegistroFormInteraction() {
        return Tasks.instrumented(ConfirmarRegistroFormInteraction.class);
    }
}
