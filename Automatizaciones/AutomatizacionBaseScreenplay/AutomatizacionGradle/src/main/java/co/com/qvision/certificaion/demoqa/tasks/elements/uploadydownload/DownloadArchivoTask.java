package co.com.qvision.certificaion.demoqa.tasks.elements.uploadydownload;

import co.com.qvision.certificaion.demoqa.interactions.elements.uploadydown.DownloadArchivoInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DownloadArchivoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DownloadArchivoInteraction.downloadArchivoInteraction()
        );
    }

    public static DownloadArchivoTask downloadArchivoTask() {
        return Tasks.instrumented(DownloadArchivoTask.class);
    }
}
