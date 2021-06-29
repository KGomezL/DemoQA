package co.com.qvision.certificaion.demoqa.interactions.forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_FORMS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPageUI.MENU_IZQ_FORMS_PRACTICE_FORM;

public class SeleccionarOpcionesInicialesInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_FORMS),
                Click.on(TARJETA_FORMS),
                Click.on(MENU_IZQ_FORMS_PRACTICE_FORM)
        );
    }

    public static SeleccionarOpcionesInicialesInteraction seleccionarOpcionesInicialesInteractions() {
        return Tasks.instrumented(SeleccionarOpcionesInicialesInteraction.class);
    }
}
