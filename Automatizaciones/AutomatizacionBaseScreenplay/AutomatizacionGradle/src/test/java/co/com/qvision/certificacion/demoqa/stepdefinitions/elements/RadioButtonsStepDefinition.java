package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.tasks.elements.TarjetaPrincipalElementsTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.radiobutton.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class RadioButtonsStepDefinition {

    @Dado("que el usuario acceda al modulo Elements")
    public void queElUsuarioAccedaAlModuloElements() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsTask.tarjetaPrincipalElementsTask()
        );
    }

    @Cuando("seleccione el item Radio Button")
    public void seleccioneElItemRadioButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarRadioButtonTask.seleccionarRadioButtonTask()
        );
    }

    @Entonces("se le mostrara el contenido de esa seccion")
    public void seLeMostraraElContenidoDeEsaSeccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarRadioButtonTask.seleccionarRadioButtonTask()
        );
    }

    @Dado("que el usuario haya leido la pregunta Te gusta el sitio y decida entre las opciones de respuesta")
    public void queElUsuarioHayaLeidoLaPreguntaTeGustaElSitioYDecidaEntreLasOpcionesDeRespuesta() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsTask.tarjetaPrincipalElementsTask(),
                SeleccionarRadioButtonTask.seleccionarRadioButtonTask()
        );
    }

    @Cuando("marque la opcion afirmativa {string}")
    public void marqueLaOpcionAfirmativa(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RBOpcionYesTask.radioButtonOpcionesTask()
        );
    }

    @Entonces("podra ver un mensaje con la opcion seleccionada de la siguiente manera {string}")
    public void podraVerUnMensajeConLaOpcionSeleccionadaDeLaSiguienteManera(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VisualizarEleccionTask.visualizarEleccionTask()
        );
    }

    @Cuando("marque la opcion {string}")
    public void marqueLaOpcion(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RBOpcionImpressiveTask.rbOpcionImpressiveTask()
        );
    }

    @Cuando("se ubique en la opcion negativa {string}")
    public void seUbiqueEnLaOpcionNegativa(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RBOpcionNoTask.rbOpcionNoTask()
        );
    }

    @Entonces("podra visualizar el simbolo de prohibido indicandole que no puede seleccionar esa opcion")
    public void podraVisualizarElSimboloDeProhibidoIndicandoleQueNoPuedeSeleccionarEsaOpcion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VisualizarEleccionTask.visualizarEleccionTask()
        );
    }
}
