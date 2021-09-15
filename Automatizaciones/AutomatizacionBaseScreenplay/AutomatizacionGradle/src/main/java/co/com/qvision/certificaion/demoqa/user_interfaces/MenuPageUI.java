package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPageUI {
    /**
     * Módulo Elements y sus items
     */

    //Item TextBox
    public static final Target MENU_IZQ_ELEMENT_TEXT_BOX =
            Target.the("Item Text Box del menú izquierdo")
            .locatedBy("//span[contains(text(), 'Text Box')]");

    //Item RadioButton
    public static final Target MENU_IZQ_ELEMENT_RADIO_BUTTONS =
            Target.the("Item Radio Button del menú izquierdo")
                    .locatedBy("//span[contains(text(), 'Radio Button')]");

    //Item Upload and Download
    public static final Target MENU_IZQ_ELEMENT_UPLOAD_DOWNLOAD =
            Target.the("Item Upload and Download del menú izquierdo")
                    .locatedBy("//span[contains(text(), 'Upload and Download')]");

    /**
     * Módulo Forms y su item
     */

    //Item Practice Form
    public static final Target MENU_IZQ_FORMS_PRACTICE_FORM =
            Target.the("Item Practice Forms del menú izquierdo")
                    .locatedBy("//span[contains(text(),'Practice Form')]");

    /**
     * Módulo Alerts, Frame & Windows
     */

    //Item Alerts
    public static final Target MENU_IZQ_AFW_ALERTS =
            Target.the("Item Alerts del menú izquierdo")
                    .locatedBy("//span[contains(text(),'Alerts')]");
}
