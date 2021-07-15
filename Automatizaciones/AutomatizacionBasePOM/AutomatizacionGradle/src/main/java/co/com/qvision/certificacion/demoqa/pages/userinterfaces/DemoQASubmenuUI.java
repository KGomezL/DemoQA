package co.com.qvision.certificacion.demoqa.pages.userinterfaces;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQASubmenuUI extends PageObject {

    public WebElement getOpcion(String dato) {
        return getDriver().findElement(By.xpath("//span[contains(text(),'"+dato+"')]"));
    }
}
