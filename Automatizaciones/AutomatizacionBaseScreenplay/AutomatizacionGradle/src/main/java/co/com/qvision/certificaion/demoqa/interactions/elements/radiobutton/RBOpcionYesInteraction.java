package co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.radiobutton.RadioButtonPage.HEADER;
import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.radiobutton.RadioButtonPage.RADIO_BUTTON_YES;

public class RBOpcionYesInteraction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HEADER),
                Click.on(RADIO_BUTTON_YES)
        );
    }

    public static RBOpcionYesInteraction radioButtonOpcionesInteraction() {
        return Tasks.instrumented(RBOpcionYesInteraction.class);
    }
}
