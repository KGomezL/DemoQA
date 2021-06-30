package co.com.qvision.certificacion.demoqa.stepdefinitions.elements;

import co.com.qvision.certificaion.demoqa.tasks.elements.TarjetaPrincipalElementsTask;
import co.com.qvision.certificaion.demoqa.tasks.elements.uploadydownload.SeleccionarUploadyDownloadTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class UploadYDownloadStepDefinition {
    @Dado("que el usuario ingresa al modulo Upload Download y ubica el boton de Download")
    public void queElUsuarioIngresaAlModuloUploadDownloadYUbicaElBotonDeDownload() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TarjetaPrincipalElementsTask.tarjetaPrincipalElementsTask()
        );
    }

    @Cuando("el usuario accede al item de Download")
    public void elUsuarioAccedeAlItemDeDownload() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarUploadyDownloadTask.seleccionarUploadyDownloadTask()
        );
    }

    @Entonces("valido que al acceder al item Download se de la correcta descarga de un archivo")
    public void validoQueAlAccederAlItemDownloadSeDeLaCorrectaDescargaDeUnArchivo() {

    }

    @Dado("que el usuario ingresa al modulo Upload & Download y ubica el boton Seleccionar un archivo")
    public void queElUsuarioIngresaAlModuloUploadDownloadYUbicaElBotonSeleccionarUnArchivo() {

    }

    @Cuando("el usuario accede al item Seleccionar un archivo")
    public void elUsuarioAccedeAlItemSeleccionarUnArchivo() {

    }

    @Entonces("valido que se despliegue una ventana nueva con acceso a los diferentes directorios del equipo que se permita la seleccion de un archivo y se cargue correctamente adicional que me permita ver el nombre del archivo seleccionado y la ruta en la que se encontro")
    public void validoQueSeDespliegueUnaVentanaNuevaConAccesoALosDiferentesDirectoriosDelEquipoQueSePermitaLaSeleccionDeUnArchivoYSeCargueCorrectamenteAdicionalQueMePermitaVerElNombreDelArchivoSeleccionadoYLaRutaEnLaQueSeEncontro() {

    }
}
