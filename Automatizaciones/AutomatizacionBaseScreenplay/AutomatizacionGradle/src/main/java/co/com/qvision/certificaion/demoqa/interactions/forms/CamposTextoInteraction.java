package co.com.qvision.certificaion.demoqa.interactions.forms;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;


import static co.com.qvision.certificaion.demoqa.user_interfaces.forms.FormsPage.*;

public class CamposTextoInteraction implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Pedro").into(NAME),
                Enter.theValue("Prueba").into(LAST_NAME),
                Enter.theValue("pedro@prueba.com").into(EMAIL),
                Click.on(GENDER),
                Enter.theValue("3013589633").into(MOBILE),
                Scroll.to(MOBILE),
                /**
                 * Acciones para seleccionar fecha
                 */
                Click.on(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.BACK_SPACE).into(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.BACK_SPACE).into(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.BACK_SPACE).into(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Hit.the(Keys.BACK_SPACE).into(DATE_BIRTH),
                DoubleClick.on(DATE_BIRTH),
                Enter.keyValues("12-12-2000").into(DATE_BIRTH),
                Hit.the(Keys.ENTER).keyIn(DATE_BIRTH),
                Scroll.to(DATE_BIRTH),
                Enter.theValue("Math").into(SUBJECTS),
                Hit.the(Keys.ENTER).into(SUBJECTS),
                Click.on(HOBBIES_SPORTS),
//                Click.on(PICTURE),
                Enter.theValue("Carrera 10").into(CURRENT_ADD),
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
