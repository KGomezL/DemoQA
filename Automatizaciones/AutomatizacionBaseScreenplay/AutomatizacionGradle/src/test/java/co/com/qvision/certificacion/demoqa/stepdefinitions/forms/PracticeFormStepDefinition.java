package co.com.qvision.certificacion.demoqa.stepdefinitions.forms;

import co.com.qvision.certificaion.demoqa.tasks.forms.ConfirmarRegistroFormTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.LlenarFormularioTask;
import co.com.qvision.certificaion.demoqa.tasks.forms.SeleccionarOpcionTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class PracticeFormStepDefinition {
    @Dado("que el usuario ingresa a la opcion de La Tarjeta y el submenu Seleccionado")
    public void queElUsuarioIngresaALaOpcionDeLaTarjetaYElSubmenuSeleccionado() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        SeleccionarOpcionTask.seleccionarOpcionTask()
                );
    }

    @Cuando("lleno el formulario")
    public void llenoElFormulario() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        LlenarFormularioTask.llenarFormularioTask()
                );
    }

    @Entonces("Confirmo si se registro el formulario con campos vacios")
    public void confirmoSiSeRegistroElFormularioConCamposVacios() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        ConfirmarRegistroFormTask.confirmarRegistroFormTask()
                );
    }
}

