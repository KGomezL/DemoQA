package co.com.qvision.certificaion.demoqa.tasks.elements.radiobutton;

import co.com.qvision.certificaion.demoqa.interactions.elements.radiobutton.RBOpcionImpressiveInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RBOpcionImpressiveTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RBOpcionImpressiveInteraction.rbOpcionImpressiveInteraction()
        );
    }

    public static RBOpcionImpressiveTask rbOpcionImpressiveTask() {
        return Tasks.instrumented(RBOpcionImpressiveTask.class);
    }
}
