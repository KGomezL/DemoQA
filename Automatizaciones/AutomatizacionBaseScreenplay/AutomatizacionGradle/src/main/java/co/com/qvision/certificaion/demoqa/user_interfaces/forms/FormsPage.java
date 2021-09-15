package co.com.qvision.certificaion.demoqa.user_interfaces.forms;

import net.serenitybdd.screenplay.targets.Target;

public class FormsPage {
    public static final Target NAME
            = Target.the("Campo Nombre")
            .locatedBy("//*[@id='firstName']");

    public static final Target LAST_NAME
            = Target.the("Campo Apellido")
            .locatedBy("//*[@id='lastName']");

    public static final Target EMAIL
            = Target.the("Campo Email")
            .locatedBy("//*[@id='userEmail']");

    public static final Target GENDER
            = Target.the("Radio Button Género")
            .locatedBy("//*[@for='gender-radio-{0}']");

    public static final Target MOBILE
            = Target.the("Campo Móvil")
            .locatedBy("//*[@id='userNumber']");

    public static final Target DATE_BIRTH
            = Target.the("Campo Fecha de Nacimiento")
            .locatedBy("//*[@id='dateOfBirthInput']");

    public static final Target SUBJECTS
            = Target.the("Campo Subjects")
            .locatedBy("//*[@id='subjectsInput']");

    public static final Target HOBBIES_SPORTS
            = Target.the("Campo Hobbie Sports")
            .locatedBy("//label[contains(@for, 'hobbies-checkbox-1') and @class='custom-control-label']");

    public static final Target PICTURE
            = Target.the("Botón para seleccionar archivo")
            .locatedBy("//*[@id='uploadPicture']");

    public static final Target STATE
            = Target.the("Lista Desplegable de estado")
            .locatedBy("//div[text() = 'Select State']");

    public static final Target SELECT_STATE
            = Target.the("Seleccionar Estado").
            locatedBy("//*[@id='react-select-3-option-0']");

    public static final Target CITY
            = Target.the("Lista Desplegable de ciudades")
            .locatedBy("//div[text() = 'Select City']");

    public static final Target SELECT_CITY
            = Target.the("Seleccionar Ciudad").
            locatedBy("//*[@id='react-select-4-option-0']");

    public static final Target CURRENT_ADD
            = Target.the("Campo para la dirección actual")
            .locatedBy("//*[@id='currentAddress']");

    public static final Target BOTON_SUBMIT
            = Target.the("Botón submit")
            .locatedBy("//*[@id='submit']");

    public static final Target VER_DILIGENCIADOS
            = Target.the("Tabla para ver campos diligenciados")
            .locatedBy(" //div[contains(@class, 'modal-content')] ");

    public static final Target CAMPO_TABLA
            = Target.the("Campo tabla en posiciones {0} {1}")
            .locatedBy("//table/tbody/tr[{0}]/td[{1}]");

    // //div[contains(@class, 'modal-content')]
}
