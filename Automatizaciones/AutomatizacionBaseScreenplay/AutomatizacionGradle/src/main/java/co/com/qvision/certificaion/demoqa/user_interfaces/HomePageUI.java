package co.com.qvision.certificaion.demoqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {
    /**
     * Tarjetas de los módulos de DemoQA
     */

    // Tarjeta Módulo Elements
    public static final Target TARJETA_ELEMENTS =
            Target.the("Tarjeta elements del menú principal")
            .locatedBy("//h5[contains(text(), 'Elements')]");

    // Tarjeta Módulo Forms
    public static final Target TARJETA_FORMS =
            Target.the("Tarjeta forms del menú principal")
                    .locatedBy("//h5[contains(text(), 'Forms')]");

    // Tarjeta Módulo Alerts
    public static final Target TARJETA_ALERTS =
            Target.the("Tarjeta alerts del menú principal")
                    .locatedBy("//h5[contains(text(), 'Alerts')]");

//    public static final Target TARJETA_WIDGETS =
//            Target.the("Tarjeta widgets del menú principal")
//                    .locatedBy("//h5[contains(text(), 'Widgets')]");
//
//    public static final Target TARJETA_INTERACTIONS =
//            Target.the("Tarjeta interactions del menú principal")
//                    .locatedBy("//h5[contains(text(), 'Interactions')]");
}
