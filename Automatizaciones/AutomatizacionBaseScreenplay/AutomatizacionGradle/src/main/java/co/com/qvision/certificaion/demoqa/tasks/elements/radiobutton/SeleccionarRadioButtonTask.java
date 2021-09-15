package co.com.qvision.certificaion.demoqa.tasks.elements.radiobutton;

import co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton.SeleccionarRadioButtonInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarRadioButtonTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarRadioButtonInteraction.seleccionarRadioButtonInteraction()
        );
    }

    public static SeleccionarRadioButtonTask seleccionarRadioButtonTask() {
        return Tasks.instrumented(SeleccionarRadioButtonTask.class);
    }
}
