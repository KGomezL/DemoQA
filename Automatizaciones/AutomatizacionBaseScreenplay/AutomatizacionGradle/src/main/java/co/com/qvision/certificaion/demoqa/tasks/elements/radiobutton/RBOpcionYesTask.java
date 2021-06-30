package co.com.qvision.certificaion.demoqa.tasks.elements.radiobutton;

import co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton.RBOpcionYesInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RBOpcionYesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RBOpcionYesInteraction.radioButtonOpcionesInteraction()
        );
    }

    public static RBOpcionYesTask radioButtonOpcionesTask() {
        return Tasks.instrumented(RBOpcionYesTask.class);
    }
}
