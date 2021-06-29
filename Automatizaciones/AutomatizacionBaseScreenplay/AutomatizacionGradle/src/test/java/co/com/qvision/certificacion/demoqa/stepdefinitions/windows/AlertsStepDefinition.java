package co.com.qvision.certificacion.demoqa.stepdefinitions.windows;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.qvision.certificaion.demoqa.user_interfaces.alerts.AlertsPageUI.BOTON_5_SEC;
import static co.com.qvision.certificaion.demoqa.user_interfaces.alerts.AlertsPageUI.BOTON_ALERTS;
//import static co.com.qvision.certificaion.demoqa.user_interfaces.HomePageUI.TARJETA_ALERTA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AlertsStepDefinition {
    @Dado("que el usuario quiera ver la alerta")
    public void queElUsuarioQuieraVerLaAlerta() {

    }

    @Cuando("seleccione el boton Haz click en mi que corresponde a la alerta deseada")
    public void seleccioneElBotonHazClickEnMiQueCorrespondeALaAlertaDeseada() {

    }

    @Entonces("se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void seMostraraUnaVentanaConUnMensajeDeLaAccionEjecutadaYParaContinuarDeberaDarClickEnElBotonAceptar() {

    }

    @Dado("que el usuario quiera ver la alerta despues de cinco segundos")
    public void queElUsuarioQuieraVerLaAlertaDespuesDeCincoSegundos() {
        theActorInTheSpotlight().attemptsTo(
//                Scroll.to(TARJETA_ALERTA),
//                Click.on(TARJETA_ALERTA),
                Scroll.to(BOTON_ALERTS),
                Click.on(BOTON_ALERTS)
        );
    }

    @Cuando("seleccione el boton Haz click en mi que corresponde a la alerta despues de cinco segundos")
    public void seleccioneElBotonHazClickEnMiQueCorrespondeALaAlertaDespuesDeCincoSegundos() {
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(BOTON_5_SEC),
                Click.on(BOTON_5_SEC)
        );
    }

    @Entonces("se mostrara una ventana despues de cinco segundos con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void seMostraraUnaVentanaDespuesDeCincoSegundosConUnMensajeDeLaAccionEjecutadaYParaContinuarDeberaDarClickEnElBotonAceptar() {

    }

    @Dado("que el usuario quiera ver la confirmacion al seleccionar el boton")
    public void queElUsuarioQuieraVerLaConfirmacionAlSeleccionarElBoton() {

    }

    @Entonces("se mostrara un cuadro donde debe seleccionar aceptar para confirmar la accion y que esta se vea al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarAceptarParaConfirmarLaAccionYQueEstaSeVeaAlLadoDelEnunciadoDelBoton() {

    }

    @Entonces("se mostrara un cuadro donde debe seleccionar cancelar para ver esta eleccion al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarCancelarParaVerEstaEleccionAlLadoDelEnunciadoDelBoton() {

    }

    @Dado("que el usuario quiera validar la aparicion de un cuadro de aviso")
    public void queElUsuarioQuieraValidarLaAparicionDeUnCuadroDeAviso() {

    }

    @Entonces("se mostrara un aviso donde puede ingresar su nombre el cual se vera reflejado al lado del enunciado si selecciona el boton aceptar")
    public void seMostraraUnAvisoDondePuedeIngresarSuNombreElCualSeVeraReflejadoAlLadoDelEnunciadoSiSeleccionaElBotonAceptar() {

    }

    @Entonces("se mostrara un aviso donde puede ingresar su nombre el cual no se vera reflejado al lado del enunciado si selecciona el boton cancelar")
    public void seMostraraUnAvisoDondePuedeIngresarSuNombreElCualNoSeVeraReflejadoAlLadoDelEnunciadoSiSeleccionaElBotonCancelar() {

    }

    @Dado("que como usuario del modulo Alerts frame & windows")
    public void queComoUsuarioDelModuloAlertsFrameWindows() {

    }

    @Cuando("selecciono cada boton")
    public void seleccionoCadaBoton() {

    }

    @Entonces("verifico los mensajes en los alerts")
    public void verificoLosMensajesEnLosAlerts() {

    }
}
