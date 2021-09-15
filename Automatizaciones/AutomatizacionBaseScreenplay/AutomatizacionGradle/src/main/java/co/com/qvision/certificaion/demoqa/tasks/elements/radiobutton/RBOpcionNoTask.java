package co.com.qvision.certificaion.demoqa.tasks.elements.radiobutton;

import co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton.RBOpcionNoInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RBOpcionNoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RBOpcionNoInteraction.rbOpcionNoInteraction()
        );
    }

    public static RBOpcionNoTask rbOpcionNoTask() {
        return Tasks.instrumented(RBOpcionNoTask.class);
    }
}
