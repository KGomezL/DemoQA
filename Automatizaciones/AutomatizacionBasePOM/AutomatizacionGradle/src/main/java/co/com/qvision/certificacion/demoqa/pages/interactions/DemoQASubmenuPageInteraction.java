package co.com.qvision.certificacion.demoqa.pages.interactions;


import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import co.com.qvision.certificacion.demoqa.pages.userinterfaces.DemoQASubmenuUI;

public class DemoQASubmenuPageInteraction extends DemoQASubmenuUI {
    public void seleccionarOpcionSubMenu(String opcion){
        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getOpcion(opcion), true);
        getOpcion(opcion).click();
    }
}
