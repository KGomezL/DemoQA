package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class PracticeFormStepDefinition {

    @Dado("que como usuario en el modulo forms y en el item practices form")
    public void queComoUsuarioEnElModuloFormsYEnElItemPracticesForm() {
        System.out.println("entro al dado ");
    }

    @Cuando("selecciono el boton submit")
    public void seleccionoElBotonSubmit() {
        System.out.println("entro al cuando");
    }


    @Entonces("confirmo si se registra el formulario con campos vacios")
    public void confirmoSiSeRegistraElFormularioConCamposVacios() {
        System.out.println("entro al entonces");

    }



}
