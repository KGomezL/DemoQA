package co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton;

import javafx.print.PaperSource;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.radiobutton.RadioButtonPage.*;

public class RBOpcionImpressiveInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HEADER),
                Click.on(RADIO_BUTTON_IMP)
        );
    }

    public static RBOpcionImpressiveInteraction rbOpcionImpressiveInteraction() {
        return Tasks.instrumented(RBOpcionImpressiveInteraction.class);
    }
}
