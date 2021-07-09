package co.com.qvision.certificaion.demoqa.interactions.alerts.alerts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPageUI.MENU_IZQ_AFW_ALERTS;

public class AFWAlertsInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MENU_IZQ_AFW_ALERTS),
                Click.on(MENU_IZQ_AFW_ALERTS)
        );
    }
    public static AFWAlertsInteraction afwAlertsInteraction() {
        return Tasks.instrumented(AFWAlertsInteraction.class);
    }
}
