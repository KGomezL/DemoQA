package co.com.qvision.certificaion.demoqa.interactions.alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_ALERTS;

public class TarjetaPrincipalAFWInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARJETA_ALERTS),
                Click.on(TARJETA_ALERTS)
        );
    }

    public static TarjetaPrincipalAFWInteraction tarjetaPrincipalAFWInteraction() {
        return Tasks.instrumented(TarjetaPrincipalAFWInteraction.class);
    }
}
