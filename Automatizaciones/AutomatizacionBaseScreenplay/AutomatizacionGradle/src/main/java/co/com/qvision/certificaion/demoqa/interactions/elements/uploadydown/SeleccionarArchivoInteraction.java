package co.com.qvision.certificaion.demoqa.interactions.elements.uploadydown;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;

import static co.com.qvision.certificaion.demoqa.user_interfaces.MenuPageUI.*;

public class SeleccionarArchivoInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MENU_IZQ_ELEMENT_RADIO_BUTTONS),
                Click.on(MENU_IZQ_ELEMENT_UPLOAD_DOWNLOAD),
                Enter.keyValues("C:\\Users\\GS-0006\\Desktop\\Work\\Repositorio\\DemoQA\\DemoQaSemillero202106\\Automatizaciones\\AutomatizacionBaseScreenplay\\AutomatizacionGradle\\src\\test\\resources\\data\\archivo.txt")
                .into(By.id("uploadFile"))
        );
//        System.out.println("test");
    }

    public static SeleccionarArchivoInteraction seleccionarArchivoInteraction() {
        return Tasks.instrumented(SeleccionarArchivoInteraction.class);
    }
}
