package co.com.qvision.certificaion.demoqa.interactions.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPageUI.MENU_IZQ_ELEMENT_TEXT_BOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ElementsTextBoxInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MENU_IZQ_ELEMENT_TEXT_BOX),
                Click.on(MENU_IZQ_ELEMENT_TEXT_BOX)
        );
    }

    public static ElementsTextBoxInteraction elementsTextBoxInteraction() {
        return instrumented(ElementsTextBoxInteraction.class);
    }
}
