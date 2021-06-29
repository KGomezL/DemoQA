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

    /**
     * Módulo Forms y su item
     */

    //Item Practice Form
    public static final Target MENU_IZQ_FORMS_PRACTICE_FORM =
            Target.the("Item Practice Forms del menú izquierdo")
                    .locatedBy("//span[contains(text(),'Practice Form')]");


}
