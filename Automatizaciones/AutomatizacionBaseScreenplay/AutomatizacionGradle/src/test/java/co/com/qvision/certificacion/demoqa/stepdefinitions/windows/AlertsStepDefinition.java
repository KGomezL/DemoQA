package co.com.qvision.certificacion.demoqa.stepdefinitions.windows;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificaion.demoqa.models.alerts.OpcionBotonModel;
import co.com.qvision.certificaion.demoqa.questions.alerts.*;
import co.com.qvision.certificaion.demoqa.tasks.alerts.TarjetaPrincipalAFWTask;
import co.com.qvision.certificaion.demoqa.tasks.alerts.alerts.SeleccionarAlertsTask;
import co.com.qvision.certificaion.demoqa.tasks.alerts.alerts.VerAlertaTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AlertsStepDefinition {

    @Dado("que el usuario quiera ver la alerta")
    public void queElUsuarioQuieraVerLaAlerta(OpcionesMenuModel opcionesMenuModel) {
        theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalAFWTask.tarjetaPrincipalAFWTask(),
                SeleccionarAlertsTask.seleccionarAlertsTask(opcionesMenuModel)
        );
    }

    @Cuando("seleccione el boton Haz click en mi que corresponde a la alerta deseada")
    public void seleccioneElBotonHazClickEnMiQueCorrespondeALaAlertaDeseada(OpcionBotonModel opcionBotonModel) {
        theActorInTheSpotlight().attemptsTo(
                VerAlertaTask.verAlertaTask(opcionBotonModel)
        );
    }

    @Entonces("se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void seMostraraUnaVentanaConUnMensajeDeLaAccionEjecutadaYParaContinuarDeberaDarClickEnElBotonAceptar() {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat("La validación de mi prueba",
                        ValidarAlertsQuestion.validarAlertsQuestion(),
                        Matchers.anyOf(
                                Matchers.is("You clicked a button"),
                                Matchers.is("This alert appeared after 5 seconds")
                        ))
                );
    }

    @Dado("que el usuario quiera ver la confirmacion al seleccionar el boton")
    public void queElUsuarioQuieraVerLaConfirmacionAlSeleccionarElBoton(OpcionesMenuModel opcionesMenuModel) {
        theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalAFWTask.tarjetaPrincipalAFWTask(),
                SeleccionarAlertsTask.seleccionarAlertsTask(opcionesMenuModel)
        );
    }

    @Entonces("se mostrara un cuadro donde debe seleccionar aceptar para continuar y la eleccion la vera al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarAceptarParaContinuarYLaEleccionLaVeraAlLadoDelEnunciadoDelBoton() {
        theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat("La validación de mi prueba",
                        ValidarAlertConfirmQuestion.validarAlertConfirmQuestion(),
                        Matchers.is("Do you confirm action?"))
                );
    }

    @Entonces("se mostrara un cuadro donde debe seleccionar cancelar para continuar y la eleccion la vera al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarCancelarParaContinuarYLaEleccionLaVeraAlLadoDelEnunciadoDelBoton() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat("La validación de mi prueba",
                ValidarAlertCancelQuestion.validarAlertCancelQuestion(),
                Matchers.is("Do you confirm action?"))
        );
    }

    @Dado("que el usuario quiera validar la aparicion de un cuadro de aviso")
    public void queElUsuarioQuieraValidarLaAparicionDeUnCuadroDeAviso(OpcionesMenuModel opcionesMenuModel) {
        theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalAFWTask.tarjetaPrincipalAFWTask(),
                SeleccionarAlertsTask.seleccionarAlertsTask(opcionesMenuModel)
        );
    }

    @Entonces("podra ingresar su nombre el cual se vera reflejado al lado del enunciado si selecciona el boton aceptar")
    public void podraIngresarSuNombreElCualSeVeraReflejadoAlLadoDelEnunciadoSiSeleccionaElBotonAceptar() {
        theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat("La validación de mi prueba",
                        ValidarAlertConfirmPromptQuestion.validarAlertConfirmPromptQuestion(),
                        Matchers.is("Please enter your name")
                        )
                );
    }


    @Entonces("podra ingresar su nombre pero no se vera al lado del enunciado si selecciona el boton cancelar")
    public void podraIngresarSuNombrePeroNoSeVeraAlLadoDelEnunciadoSiSeleccionaElBotonCancelar() {
        theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat("La validación de mi prueba",
                        ValidarAlertCancelPromptQuestion.validarAlertCancelPromptQuestion(),
                        Matchers.is("Please enter your name")
                        )
                );
    }
}
