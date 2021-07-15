package co.com.qvision.certificacion.demoqa.pages.interactions.forms;

import co.com.qvision.certificacion.demoqa.models.forms.FormData;
import co.com.qvision.certificacion.demoqa.pages.user_interfaces.forms.DemoQAFormsUI;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public class DemoQAFormsInteraction extends DemoQAFormsUI {

    public String setGenero(String genero){
        switch(genero){
            case ("Male"):
                return  "1";
            case ("Female"):
                return "2";
            default:
                return "3";
        }
    }

    public void enviarFormulario(FormData datos){
        nombre.sendKeys(datos.getNombre());
        apellido.sendKeys(datos.getApellido());
        email.sendKeys(datos.getEmail());
        getGenero(setGenero(datos.getGenero())).click();
        telefono.sendKeys(datos.getTelefono());

        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getCampoID("submit"), true);
        getCampoID("submit").click();
    }

    public FormData obtenerDatosTabla(){
        return new FormData(
                getCampoTabla("1","2").getText().split(" ")[0],
                getCampoTabla("1","2").getText().split(" ")[1],
                getCampoTabla("2","2").getText(),
                getCampoTabla("3","2").getText(),
                getCampoTabla("4","2").getText()
        );
    }
}
