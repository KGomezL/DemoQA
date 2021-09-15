package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.models.textbox.FormEmailTextBoxModel;
import co.com.qvision.certificaion.demoqa.questions.textbox.ValidarMensajeEmailQuestion;
import co.com.qvision.certificaion.demoqa.tasks.elements.TarjetaPrincipalElementsTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.textbox.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;

public class TextBoxStepDefinition {
    @Dado("Yo como usuario ingrese al modulo Elements")
    public void yoComoUsuarioIngreseAlModuloElements() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsTask.tarjetaPrincipalElementsTask()
        );
    }

    @Cuando("Seleccione Text Box")
    public void seleccioneTextBox() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarTextBoxTask.seleccionarTextBoxTask()
        );
    }

    @Entonces("Despliegue el formulario")
    public void despliegueElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarTextBoxTask.seleccionarTextBoxTask()
        );
    }

    @Dado("Yo como usuario este en el formulario desplegado de Text Box")
    public void yoComoUsuarioEsteEnElFormularioDesplegadoDeTextBox() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsTask.tarjetaPrincipalElementsTask(),
                SeleccionarTextBoxTask.seleccionarTextBoxTask()
        );
    }

    @Cuando("Diligencio cada uno de los campos")
    public void diligencioCadaUnoDeLosCampos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DiligenciarCamposTextBoxTask.diligenciarCamposTextBoxTask()
        );
    }

    @Entonces("Se visualizara el resumen de la informacion diligenciada")
    public void seVisualizaraElResumenDeLaInformacionDiligenciada() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
        );
    }

    @Cuando("Diligencio solo el campo Full Name")
    public void diligencioSoloElCampoFullName() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DiligenciarFullNameTextBoxTask.diligenciarFullNameTextBoxTask()
        );
    }

    @Entonces("Se visualizara el resumen con el nombre")
    public void seVisualizaraElResumenConElNombre() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
        );
    }

    @Cuando("Diligencio solo el campo E mail")
    public void diligencioSoloElCampoEMail() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DiligenciarEmailTextBoxTask.diligenciarEmailTextBoxTask()
        );
    }

    @Entonces("Se visualizara el resumen del E mail")
    public void seVisualizaraElResumenDelEMail() {
//        theActorInTheSpotlight().attemptsTo(
//                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
//        );
        FormEmailTextBoxModel formEmailTextBoxModel = new FormEmailTextBoxModel("armando@casas.com");
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat("La validación de mi prueba",
                        ValidarMensajeEmailQuestion.validarMensajeEmailQuestion(),
                        sameBeanAs(formEmailTextBoxModel)));
    }

    @Cuando("Envio el formulario sin diligenciar")
    public void envioElFormularioSinDiligenciar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
        );
    }

    @Entonces("No se visualizara ningun cambio")
    public void noSeVisualizaraNingunCambio() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
        );
    }
}
