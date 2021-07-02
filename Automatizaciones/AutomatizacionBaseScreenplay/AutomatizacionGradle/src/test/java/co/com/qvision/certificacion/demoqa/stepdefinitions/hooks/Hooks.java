package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificaion.demoqa.models.forms.FormData;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

//    //TextBox
//    @Before(value = "@textBox", order = 0)
//    public void abrirNavegador() {
//        OnStage.setTheStage(new OnlineCast());
//        OnStage.theActorCalled("Mateo");
//        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
//    }

    //Practice Form
    @Before(value = "@practiceForm", order = 0)
    public void abrirNavegador() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Armando");
        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
    }

    @DataTableType
    public OpcionesMenuModel opcionesMenuModel(Map<String,String> datos){
        return new OpcionesMenuModel(datos.get("La Tarjeta"),datos.get("Seleccionado"));
    }

    @DataTableType
    public FormData datosFormulario(Map<String,String> datos){
        return new FormData(
                datos.get("Nombre"),
                datos.get("Apellido"),
                datos.get("Genero"),
                datos.get("Email"),
                datos.get("Telefono"),
                datos.get("Fecha"),
                datos.get("Subjects"),
                datos.get("CurrentAdd"),
                datos.get("State"),
                datos.get("City")
        );
    }


//

    //Radio Buttton
//    @Before(value = "@radioButton", order = 1)
//    public void abrirNavegador() {
//        OnStage.setTheStage(new OnlineCast());
//        OnStage.theActorCalled("Armando");
//        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
//    }

//    @Before(value = "@uploadDown", order = 1)
//    public void abrirNavegador() {
//        OnStage.setTheStage(new OnlineCast());
//        OnStage.theActorCalled("Armando");
//        theActorInTheSpotlight().attemptsTo(Open.url("https://demoqa.com/"));
//    }
}
