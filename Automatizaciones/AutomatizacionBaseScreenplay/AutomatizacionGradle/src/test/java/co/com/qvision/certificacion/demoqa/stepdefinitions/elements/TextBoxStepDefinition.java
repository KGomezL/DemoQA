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
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TextBoxStepDefinition {
    @Dado("Yo como usuario ingrese al modulo Elements")
    public void yoComoUsuarioIngreseAlModuloElements() {
        theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsTask.tarjetaPrincipalElementsTask()
        );
    }

    @Cuando("Seleccione Text Box")
    public void seleccioneTextBox() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTextBoxTask.seleccionarTextBoxTask()
        );
    }

    @Entonces("Despliegue el formulario")
    public void despliegueElFormulario() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTextBoxTask.seleccionarTextBoxTask()
        );
    }

    @Dado("Yo como usuario este en el formulario desplegado de Text Box")
    public void yoComoUsuarioEsteEnElFormularioDesplegadoDeTextBox() {
        theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsTask.tarjetaPrincipalElementsTask(),
                SeleccionarTextBoxTask.seleccionarTextBoxTask()
        );
    }

    @Cuando("Diligencio cada uno de los campos")
    public void diligencioCadaUnoDeLosCampos() {
        theActorInTheSpotlight().attemptsTo(
                DiligenciarCamposTextBoxTask.diligenciarCamposTextBoxTask()
        );
    }

    @Entonces("Se visualizara el resumen de la informacion diligenciada")
    public void seVisualizaraElResumenDeLaInformacionDiligenciada() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
        );
    }

    @Cuando("Diligencio solo el campo Full Name")
    public void diligencioSoloElCampoFullName() {
        theActorInTheSpotlight().attemptsTo(
                DiligenciarFullNameTextBoxTask.diligenciarFullNameTextBoxTask()
        );
    }

    @Entonces("Se visualizara el resumen con el nombre")
    public void seVisualizaraElResumenConElNombre() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
        );
    }

    @Cuando("Diligencio solo el campo E mail")
    public void diligencioSoloElCampoEMail() {
        theActorInTheSpotlight().attemptsTo(
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
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
        );
    }

    @Entonces("No se visualizara ningun cambio")
    public void noSeVisualizaraNingunCambio() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxTask.visualizarResumenTextBoxTask()
        );
    }
}
