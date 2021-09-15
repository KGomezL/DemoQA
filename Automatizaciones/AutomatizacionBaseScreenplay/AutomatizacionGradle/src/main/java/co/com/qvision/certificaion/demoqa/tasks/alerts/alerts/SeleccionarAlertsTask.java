package co.com.qvision.certificaion.demoqa.tasks.alerts.alerts;

import co.com.qvision.certificaion.demoqa.interactions.alerts.alerts.AFWAlertsInteraction;
import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarAlertsTask implements Task {

    OpcionesMenuModel opciones;

    public SeleccionarAlertsTask(OpcionesMenuModel opciones) {
        this.opciones = opciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AFWAlertsInteraction.afwAlertsInteraction()
        );

    }

    public static SeleccionarAlertsTask seleccionarAlertsTask(OpcionesMenuModel opciones) {
        return Tasks.instrumented(SeleccionarAlertsTask.class, opciones);
    }
}
