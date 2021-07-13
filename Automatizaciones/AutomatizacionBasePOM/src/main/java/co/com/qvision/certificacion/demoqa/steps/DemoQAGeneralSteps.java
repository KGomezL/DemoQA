package co.com.qvision.certificacion.demoqa.steps;

import co.com.qvision.certificacion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificacion.demoqa.pages.interactions.DemoQAGeneralInteraction;
import co.com.qvision.certificacion.demoqa.pages.interactions.DemoQASubmenuPageInteraction;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class DemoQAGeneralSteps {
    String texto = "Texto en variable";

    @Page
    DemoQAGeneralInteraction demoQAGeneralInteraction;

    @Page
    DemoQASubmenuPageInteraction demoQASubmenuPageInteraction;

    @Step
    public void abrirPaginaDemoQA() {
        demoQAGeneralInteraction.open();
    }

    @Step("Descripcion #texto ")
    public void validarTitulo(){
//        assertThat("los textos no coinciden ", demoQAGeneralInteraction.obtenerTituloSeleccionado(),sameBeanAs());
    }

    public void seleccionarOpcion(OpcionesMenuModel opciones) {
        demoQAGeneralInteraction.seleccionarTarjetaForms(opciones.getOpcion());
        demoQASubmenuPageInteraction.seleccionarOpcionSubMenu(opciones.getSubmenu());
    }
}



