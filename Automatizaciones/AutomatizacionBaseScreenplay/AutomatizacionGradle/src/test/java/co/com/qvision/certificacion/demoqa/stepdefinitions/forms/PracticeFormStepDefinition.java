package co.com.qvision.certificacion.demoqa.stepdefinitions.forms;


import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificaion.demoqa.models.forms.FormData;
import co.com.qvision.certificaion.demoqa.questions.forms.ValidarRegistroQuestion;
import co.com.qvision.certificaion.demoqa.tasks.forms.LlenarFormularioTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.SeleccionarOpcionTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;


public class PracticeFormStepDefinition {
    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado(OpcionesMenuModel opcionesMenuModel) {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        SeleccionarOpcionTask.seleccionarOpcionTask(opcionesMenuModel)
                );
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario(FormData formData) {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        LlenarFormularioTask.llenarFormularioTask(formData)
                );
    }

    @Entonces("Confirmo si se registra el formulario")
    public void confirmoSiSeRegistraElFormulario() {
        FormData formData = OnStage.theActorInTheSpotlight()
                .recall("datos");

        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat("La validación de mi prueba",
                        ValidarRegistroQuestion.validarRegistroQuestion(),
                        sameBeanAs(formData)));
    }
}

