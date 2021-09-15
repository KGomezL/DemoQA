package co.com.qvision.certificaion.demoqa.interactions.elements.uploadydown;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPageUI.MENU_IZQ_ELEMENT_RADIO_BUTTONS;
import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPageUI.MENU_IZQ_ELEMENT_UPLOAD_DOWNLOAD;
import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.uploadanddown.UploadDownPageUI.BOTON_DOWNLOAD;

public class DownloadArchivoInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MENU_IZQ_ELEMENT_RADIO_BUTTONS),
                Click.on(MENU_IZQ_ELEMENT_UPLOAD_DOWNLOAD),
                Click.on(BOTON_DOWNLOAD)
        );
    }

    public static DownloadArchivoInteraction downloadArchivoInteraction() {
        return Tasks.instrumented(DownloadArchivoInteraction.class);
    }
}
