package co.com.qvision.certificacion.demoqa.steps.forms;

import co.com.qvision.certificacion.demoqa.models.forms.FormData;
import co.com.qvision.certificacion.demoqa.pages.interactions.forms.DemoQAFormsInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static org.hamcrest.MatcherAssert.assertThat;

public class DemoQAFormsSteps {

    @Page
    DemoQAFormsInteraction demoQAFormsInteraction;

    @Step
    public void enviarFormulario(FormData datos) {
        demoQAFormsInteraction.enviarFormulario(datos);
    }

    @Step
    public void validarEnvioFormulario(FormData datos) {
        assertThat("Los datos no coinciden ", demoQAFormsInteraction.obtenerDatosTabla(),sameBeanAs(datos).ignoring("genero"));
    }
}
