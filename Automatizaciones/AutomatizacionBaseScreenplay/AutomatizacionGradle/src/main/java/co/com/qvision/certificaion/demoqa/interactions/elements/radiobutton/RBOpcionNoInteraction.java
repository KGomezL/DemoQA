package co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.radiobutton.RadioButtonPage.*;

public class RBOpcionNoInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HEADER),
                MoveMouse.to(RADIO_BUTTON_NO)
//                MoveMouseToTarget(RADIO_BUTTON_NO),
//                HoverOverTarget.over(RADIO_BUTTON_NO)
//                HoverOverBy.over(RADIO_BUTTON_NO),
//                HoverOverElement.over(RADIO_BUTTON_NO)
        );
    }



    public static RBOpcionNoInteraction rbOpcionNoInteraction() {
        return Tasks.instrumented(RBOpcionNoInteraction.class);
    }
}
