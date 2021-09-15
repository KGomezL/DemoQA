package co.com.qvision.certificaion.demoqa.tasks.alerts.alerts;

import co.com.qvision.certificaion.demoqa.interactions.alerts.alerts.VerAlertaInteraction;
import co.com.qvision.certificaion.demoqa.models.alerts.OpcionBotonModel;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class VerAlertaTask implements Task {

    OpcionBotonModel opcionBotonModel;

    public VerAlertaTask(OpcionBotonModel opcionBotonModel) {
        this.opcionBotonModel = opcionBotonModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("boton", opcionBotonModel);
        Serenity.setSessionVariable("boton").to(opcionBotonModel);
        actor.attemptsTo(
                VerAlertaInteraction.verAlertaInteraction()
        );
    }

    public static VerAlertaTask verAlertaTask(OpcionBotonModel opcionBotonModel) {
        return Tasks.instrumented(VerAlertaTask.class, opcionBotonModel);
    }
}
