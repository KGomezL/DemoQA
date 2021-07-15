package co.com.qvision.certificacion.demoqa.pages.interactions;

import co.com.qvision.certificacion.demoqa.models.forms.FormData;
import co.com.qvision.certificacion.demoqa.pages.userinterfaces.DemoQAGeneralUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("https://demoqa.com/")
public class DemoQAGeneralInteraction extends DemoQAGeneralUI {

    public void seleccionarTarjetaForms(String opcion) {
        List<WebElement> lista = getTarjetas();
        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getTarjetaForms(opcion), true);
        getTarjetaForms(opcion).click();
    }

    public FormData obtenerTituloSeleccionado(){
        return new FormData();
    }
}
