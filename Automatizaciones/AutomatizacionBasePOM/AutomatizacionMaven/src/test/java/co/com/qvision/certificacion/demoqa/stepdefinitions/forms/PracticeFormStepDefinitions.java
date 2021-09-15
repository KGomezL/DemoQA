package co.com.qvision.certificacion.demoqa.stepdefinitions.forms;

import co.com.qvision.certificacion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificacion.demoqa.models.forms.FormData;
import co.com.qvision.certificacion.demoqa.steps.DemoQAGeneralSteps;
import co.com.qvision.certificacion.demoqa.steps.forms.DemoQAFormsSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class PracticeFormStepDefinitions {

    @Steps
    DemoQAGeneralSteps demoQAGeneralSteps;

    @Steps
    DemoQAFormsSteps demoQAFormsSteps;

    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado(OpcionesMenuModel opcionesMenuModel) {
        demoQAGeneralSteps.seleccionarOpcion(opcionesMenuModel);
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario(FormData formData) {
        demoQAFormsSteps.enviarFormulario(formData);
    }

    @Entonces("Confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario(FormData formData) {
        demoQAFormsSteps.validarEnvioFormulario(formData);
    }
}
