package co.com.qvision.certificaion.demoqa.tasks.elements.uploadydownload;

import co.com.qvision.certificaion.demoqa.interactions.elements.uploadydown.SeleccionarArchivoInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarArchivoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarArchivoInteraction.seleccionarArchivoInteraction()
        );
    }

    public static SeleccionarArchivoTask seleccionarArchivoTask() {
        return Tasks.instrumented(SeleccionarArchivoTask.class);
    }
}
