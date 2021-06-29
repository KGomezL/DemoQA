package co.com.qvision.certificaion.demoqa.tasks.elements.textbox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.qvision.certificaion.demoqa.interactions.elements.textbox.DiligenciarFullNameTextBoxInteraction.diligenciarFullNameTextBoxInteraction;

public class DiligenciarFullNameTextBoxTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                diligenciarFullNameTextBoxInteraction()
        );
    }

    public static DiligenciarFullNameTextBoxTask diligenciarFullNameTextBoxTask() {
        return Tasks.instrumented(DiligenciarFullNameTextBoxTask.class);
    }
}
