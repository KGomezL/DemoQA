package co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPageUI.MENU_IZQ_ELEMENT_RADIO_BUTTONS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPageUI.MENU_IZQ_ELEMENT_TEXT_BOX;

public class SeleccionarRadioButtonInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MENU_IZQ_ELEMENT_TEXT_BOX),
                Click.on(MENU_IZQ_ELEMENT_RADIO_BUTTONS)
        );
    }

    public static SeleccionarRadioButtonInteraction seleccionarRadioButtonInteraction() {
        return Tasks.instrumented(SeleccionarRadioButtonInteraction.class);
    }
}
