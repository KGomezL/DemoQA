package co.com.qvision.certificaion.demoqa.tasks.elements.uploadydownload;

import co.com.qvision.certificaion.demoqa.interactions.elements.uploadydown.SeleccionarUpDownInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarUploadyDownloadTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarUpDownInteraction.seleccionarUploadyDownloadInteraction()
        );
    }

    public static SeleccionarUploadyDownloadTask seleccionarUploadyDownloadTask() {
        return Tasks.instrumented(SeleccionarUploadyDownloadTask.class);
    }
}
