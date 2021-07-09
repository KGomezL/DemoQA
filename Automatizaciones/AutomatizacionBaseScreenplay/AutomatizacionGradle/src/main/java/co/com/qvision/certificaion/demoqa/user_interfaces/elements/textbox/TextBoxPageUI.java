package co.com.qvision.certificaion.demoqa.user_interfaces.elements.textbox;

import net.serenitybdd.screenplay.targets.Target;

public class TextBoxPageUI {
    /**
     * Formulario de Text Box
     */

    //Campo Full name
    public static final Target CAMPO_FULL_NAME
            = Target.the("Campo para ingresar nombre completo")
            .locatedBy("//*[@id='userName']");

    //Campo Email
    public static final Target CAMPO_EMAIL
            = Target.the("Campo para ingresar email")
            .locatedBy("//*[@id='userEmail']");

    //Campo Current Address
    public static final Target CAMPO_CURRENT_ADD
            = Target.the("Campo para ingresar dirección actual")
            .locatedBy("//*[@id='currentAddress']");

    //Campo Permanent Address
    public static final Target CAMPO_PERMANENT_ADD
            = Target.the("Campo para ingresar dirección permanente")
            .locatedBy("//*[@id='permanentAddress']");

    //Botón Submit
    public static final Target BOTON_SUBMIT
            = Target.the("Botón Submit de formulario")
            .locatedBy("//*[@id='submit'][contains(text(), 'Submit')]");

    public static final Target OUTPUT_EMAIL
            = Target.the("Salida con el email ingresado")
            .locatedBy("//p[@id='email']");
}

