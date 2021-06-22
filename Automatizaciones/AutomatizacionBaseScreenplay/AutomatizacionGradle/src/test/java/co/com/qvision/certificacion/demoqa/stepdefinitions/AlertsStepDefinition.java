package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class AlertsStepDefinition {
    @Dado("que el usuario quiera visualizar la alerta")
    public void queElUsuarioQuieraVisualizarLaAlerta() {

    }

    @Cuando("seleccione el boton {string} que corresponde a esa alerta")
    public void seleccioneElBotonQueCorrespondeAEsaAlerta(String string) {

    }

    @Entonces("se mostrara una ventana con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void seMostraraUnaVentanaConUnMensajeDeLaAccionEjecutadaYParaContinuarDeberaDarClickEnElBotonAceptar() {

    }

    @Dado("que el usuario quiera ver la alerta despues de {int} segundos")
    public void queElUsuarioQuieraVerLaAlertaDespuesDeSegundos(Integer int1) {

    }

    @Cuando("seleccione el boton {string} que corresponde a la alerta")
    public void seleccioneElBotonQueCorrespondeALaAlerta(String string) {

    }

    @Entonces("se mostrara una ventana despues de 5s con un mensaje de la accion ejecutada y para continuar debera dar click en el boton aceptar")
    public void seMostraraUnaVentanaDespuesDe5sConUnMensajeDeLaAccionEjecutadaYParaContinuarDeberaDarClickEnElBotonAceptar() {

    }

    @Dado("que el usuario quiera ver la confirmacion al seleccionar el boton")
    public void queElUsuarioQuieraVerLaConfirmacionAlSeleccionarElBoton() {

    }

    @Cuando("seleccione el boton {string} que corresponde a la alerta de confirmacion")
    public void seleccioneElBotonQueCorrespondeALaAlertaDeConfirmacion(String string) {

    }

    @Entonces("se mostrara un cuadro donde debe seleccionar aceptar para confirmar la accion y que esta se vea al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarAceptarParaConfirmarLaAccionYQueEstaSeVeaAlLadoDelEnunciadoDelBoton() {

    }

    @Cuando("seleccione el boton {string} que corresponde a la alerta de confirmacion al cancelar")
    public void seleccioneElBotonQueCorrespondeALaAlertaDeConfirmacionAlCancelar(String string) {

    }

    @Entonces("se mostrara un cuadro donde debe seleccionar cancelar para ver esta eleccion al lado del enunciado del boton")
    public void seMostraraUnCuadroDondeDebeSeleccionarCancelarParaVerEstaEleccionAlLadoDelEnunciadoDelBoton() {

    }

    @Dado("que el usuario quiera validar la aparicion de un cuadro de aviso")
    public void queElUsuarioQuieraValidarLaAparicionDeUnCuadroDeAviso() {

    }

    @Cuando("seleccione el boton {string} que corresponde al aviso de confirmacion al aceptar")
    public void seleccioneElBotonQueCorrespondeAlAvisoDeConfirmacionAlAceptar(String string) {

    }

    @Entonces("se mostrara un aviso donde puede ingresar su nombre el cual se vera reflejado al lado del enunciado si selecciona el boton aceptar.")
    public void seMostraraUnAvisoDondePuedeIngresarSuNombreElCualSeVeraReflejadoAlLadoDelEnunciadoSiSeleccionaElBotonAceptar() {

    }

    @Cuando("seleccione el boton {string} que corresponde al aviso de confirmacion al cancelar")
    public void seleccioneElBotonQueCorrespondeAlAvisoDeConfirmacionAlCancelar(String string) {

    }

    @Entonces("se mostrara un aviso donde puede ingresar su nombre el cual no se vera reflejado al lado del enunciado si selecciona el boton cancelar.")
    public void seMostraraUnAvisoDondePuedeIngresarSuNombreElCualNoSeVeraReflejadoAlLadoDelEnunciadoSiSeleccionaElBotonCancelar() {

    }
}
