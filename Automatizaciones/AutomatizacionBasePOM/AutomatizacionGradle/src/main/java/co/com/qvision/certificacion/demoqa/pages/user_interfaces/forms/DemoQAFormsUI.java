package co.com.qvision.certificacion.demoqa.pages.user_interfaces.forms;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQAFormsUI extends PageObject {

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElementFacade nombre;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElementFacade apellido;

    @FindBy(xpath = "//*[@id='userEmail']")
    public WebElementFacade email;

    @FindBy(xpath = "//*[@id='userNumber']")
    public WebElementFacade telefono;

    public WebElement getGenero(String dato) {
        return getDriver().findElement(By.xpath("//*[@for='gender-radio-"+dato+"']"));
    }

    public WebElement getCampoID(String dato) {
        return getDriver().findElement(By.xpath("//*[@id='"+dato+"']"));
    }

    public WebElement getCampoTabla(String dato1 ,String dato2) {
        return getDriver().findElement(By.xpath(" //table/tbody/tr["+dato1+"]/td["+dato2+"]"));
    }
}
