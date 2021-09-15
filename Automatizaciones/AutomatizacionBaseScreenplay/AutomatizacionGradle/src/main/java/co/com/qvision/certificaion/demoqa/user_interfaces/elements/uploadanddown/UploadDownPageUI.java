package co.com.qvision.certificaion.demoqa.user_interfaces.elements.uploadanddown;

import net.serenitybdd.screenplay.targets.Target;

public class UploadDownPageUI {
    public static final Target BOTON_DOWNLOAD =
            Target.the("Item Upload and Download del menú izquierdo")
                    .locatedBy("//a[@id='downloadButton']");

//    public static final Target BOTON_UPLOAD =
//            Target.the("Item Upload and Download del menú izquierdo")
//                    .locatedBy("//input[(@id='uploadFile') and @type='file']");
}
