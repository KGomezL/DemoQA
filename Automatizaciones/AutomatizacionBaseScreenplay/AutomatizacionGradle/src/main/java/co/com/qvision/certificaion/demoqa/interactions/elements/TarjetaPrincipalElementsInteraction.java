package co.com.qvision.certificaion.demoqa.interactions.elements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_ELEMENTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TarjetaPrincipalElementsInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_ELEMENTS),
                Click.on(TARJETA_ELEMENTS)
        );
    }

    public static TarjetaPrincipalElementsInteraction tarjetaPrincipalElementsInteraction() {
        return instrumented(TarjetaPrincipalElementsInteraction.class);
    }

}
