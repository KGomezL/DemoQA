package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.interactions.elements.textbox.*;
import co.com.qvision.certificaion.demoqa.interactions.TarjetaPrincipalElementsInteraction;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TextBoxStepDefinition {
    @Dado("Yo como usuario ingrese al modulo Elements")
    public void yoComoUsuarioIngreseAlModuloElements() {
        theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsInteraction.tarjetaPrincipalElementsInteraction()
        );
    }

    @Cuando("Seleccione Text Box")
    public void seleccioneTextBox() {
        theActorInTheSpotlight().attemptsTo(
                ElementsTextBoxInteraction.elementsTextBoxInteraction()
        );
    }

    @Entonces("Despliegue el formulario")
    public void despliegueElFormulario() {
        theActorInTheSpotlight().attemptsTo(
                ElementsTextBoxInteraction.elementsTextBoxInteraction()
        );
    }

    @Dado("Yo como usuario este en el formulario desplegado de Text Box")
    public void yoComoUsuarioEsteEnElFormularioDesplegadoDeTextBox() {
        theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsInteraction.tarjetaPrincipalElementsInteraction(),
                ElementsTextBoxInteraction.elementsTextBoxInteraction()
        );
    }

    @Cuando("Diligencio cada uno de los campos")
    public void diligencioCadaUnoDeLosCampos() {
        theActorInTheSpotlight().attemptsTo(
                DiligenciarCamposTextBoxInteraction.diligenciarCamposTextBoxInteraction()
        );
    }

    @Entonces("Se visualizara el resumen de la informacion diligenciada")
    public void seVisualizaraElResumenDeLaInformacionDiligenciada() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxInteraction.visualizarResumenTextBoxInteraction()
        );
    }

    @Cuando("Diligencio solo el campo Full Name")
    public void diligencioSoloElCampoFullName() {
        theActorInTheSpotlight().attemptsTo(
                DiligenciarFullNameTextBoxInteraction.diligenciarFullNameTextBoxInteraction()
        );
    }

    @Entonces("Se visualizara el resumen con el nombre")
    public void seVisualizaraElResumenConElNombre() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxInteraction.visualizarResumenTextBoxInteraction()
        );
    }

    @Cuando("Diligencio solo el campo E mail")
    public void diligencioSoloElCampoEMail() {
        theActorInTheSpotlight().attemptsTo(
                DiligenciarEmailTextBoxinteraction.diligenciarEmailTextBoxinteraction()
        );
    }

    @Entonces("Se visualizara el resumen del E mail")
    public void seVisualizaraElResumenDelEMail() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxInteraction.visualizarResumenTextBoxInteraction()
        );
    }

    @Cuando("Envio el formulario sin diligenciar")
    public void envioElFormularioSinDiligenciar() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxInteraction.visualizarResumenTextBoxInteraction()
        );
    }

    @Entonces("No se visualizara ningun cambio")
    public void noSeVisualizaraNingunCambio() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarResumenTextBoxInteraction.visualizarResumenTextBoxInteraction()
        );
    }
}
