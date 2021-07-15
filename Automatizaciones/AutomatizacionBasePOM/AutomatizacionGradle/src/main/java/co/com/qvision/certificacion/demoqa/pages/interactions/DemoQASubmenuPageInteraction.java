package co.com.qvision.certificacion.demoqa.pages.interactions;

import co.com.qvision.certificacion.demoqa.pages.user_interfaces.DemoQASubmenuUI;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public class DemoQASubmenuPageInteraction extends DemoQASubmenuUI {
    public void seleccionarOpcionSubMenu(String opcion){
        JavascriptExecutorFacade js = new JavascriptExecutorFacade(getDriver());
        js.executeScript("arguments[0].scrollIntoView(arguments[1]);", getOpcion(opcion), true);
        getOpcion(opcion).click();
    }
}
