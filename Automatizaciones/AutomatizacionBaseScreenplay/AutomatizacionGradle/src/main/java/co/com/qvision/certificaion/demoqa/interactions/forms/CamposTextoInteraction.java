package co.com.qvision.certificaion.demoqa.interactions.forms;


import co.com.qvision.certificaion.demoqa.models.forms.FormData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.qvision.certificaion.demoqa.user_interfaces.forms.FormsPage.*;

public class CamposTextoInteraction implements Interaction {

    FormData formData;
    String genero;

    public void setGenero() {
        switch (formData.getGenero()) {
            case ("Male"):
                genero = "1";
                break;
            case ("Female"):
                genero = "2";
                break;
            default:
                genero = "3";
                break;
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        formData = actor.recall("datos");
        formData = Serenity.sessionVariableCalled("datos");

        setGenero();
        actor.attemptsTo(
                Enter.theValue(formData.getNombre()).into(NAME),
                Enter.theValue(formData.getApellido()).into(LAST_NAME),
                Enter.theValue(formData.getCorreo()).into(EMAIL),
                Click.on(GENDER.of(genero)),
                Enter.theValue(formData.getTelefono()).into(MOBILE),
                Scroll.to(MOBILE),
                /**
                 * Acciones para seleccionar fecha
                 */
                Click.on(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).into(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).into(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).into(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.DELETE).into(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Enter.keyValues(formData.getFecha()).into(DATE_BIRTH),
                Hit.the(Keys.ENTER).keyIn(DATE_BIRTH),
                Scroll.to(DATE_BIRTH),
                Enter.theValue(formData.getSubjects()).into(SUBJECTS),
                Hit.the(Keys.ENTER).into(SUBJECTS),
                Click.on(HOBBIES_SPORTS),
//                Click.on(PICTURE),
                Enter.theValue(formData.getCurrentAdd()).into(CURRENT_ADD),
                Scroll.to(CURRENT_ADD),
                Click.on(STATE),
                Click.on(SELECT_STATE),
                Click.on(CITY),
                Click.on(SELECT_CITY),
                Click.on(BOTON_SUBMIT)

        );
    }

    public static CamposTextoInteraction camposTextoInteraction() {
        return Tasks.instrumented(CamposTextoInteraction.class);
    }
}
