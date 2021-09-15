package co.com.qvision.certificaion.demoqa.tasks.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.qvision.certificaion.demoqa.interactions.elements.textbox.DiligenciarEmailTextBoxinteraction.diligenciarEmailTextBoxinteraction;

public class DiligenciarEmailTextBoxTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                diligenciarEmailTextBoxinteraction()
        );
    }

    public static DiligenciarEmailTextBoxTask diligenciarEmailTextBoxTask() {
        return Tasks.instrumented(DiligenciarEmailTextBoxTask.class);
    }
}
