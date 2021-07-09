package co.com.qvision.certificaion.demoqa.interactions.alerts.alerts;

import co.com.qvision.certificaion.demoqa.models.alerts.OpcionBotonModel;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.certificaion.demoqa.user_interfaces.alerts.AlertsPageUI.ALERT_BUTTON;

public class VerAlertaInteraction implements Interaction {

    OpcionBotonModel opcionBotonModel;
    String boton;

    public void setBoton() {
        switch (opcionBotonModel.getBoton()) {
            case ("alertButton"):
                boton = "alertButton";
                break;
            case ("timerAlertButton"):
                boton = "timerAlertButton";
                break;
            case ("confirmButton"):
                boton = "confirmButton";
                break;
            default:
                boton = "promtButton";
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        opcionBotonModel = actor.recall("boton");
        opcionBotonModel = Serenity.sessionVariableCalled("boton");
        setBoton();

        actor.attemptsTo(
                Click.on(ALERT_BUTTON.of(boton))
        );
    }

    public static VerAlertaInteraction verAlertaInteraction() {
        return Tasks.instrumented(VerAlertaInteraction.class);
    }
}
