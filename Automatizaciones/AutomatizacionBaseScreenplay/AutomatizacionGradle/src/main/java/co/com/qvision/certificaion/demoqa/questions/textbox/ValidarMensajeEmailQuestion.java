package co.com.qvision.certificaion.demoqa.questions.textbox;

import co.com.qvision.certificaion.demoqa.models.textbox.FormEmailTextBoxModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certificaion.demoqa.user_interfaces.elements.textbox.TextBoxPageUI.OUTPUT_EMAIL;


public class ValidarMensajeEmailQuestion implements Question<FormEmailTextBoxModel> {

    public String textoEmail(Actor actor){
        return Text.of(OUTPUT_EMAIL).viewedBy(actor).asString().split(":")[1];

    }

    @Override
    public FormEmailTextBoxModel answeredBy(Actor actor) {
        return new FormEmailTextBoxModel(textoEmail(actor));
    }

    public static ValidarMensajeEmailQuestion validarMensajeEmailQuestion() {
        return new ValidarMensajeEmailQuestion();
    }
}
