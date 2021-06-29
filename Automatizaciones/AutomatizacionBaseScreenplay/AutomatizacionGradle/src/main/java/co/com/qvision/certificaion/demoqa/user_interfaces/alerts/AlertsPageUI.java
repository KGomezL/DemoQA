package co.com.qvision.certificaion.demoqa.user_interfaces.alerts;

import net.serenitybdd.screenplay.targets.Target;

public class AlertsPageUI {
    public static final Target BOTON_ALERTS
            = Target.the("Botón en menu Alerts")
            .locatedBy("//*[@id=\"item-1\"]/span[contains(text(), 'Alert')]");
    public static final Target BOTON_5_SEC
            = Target.the("Botón de 5 segundos")
            .locatedBy("//*[@id='timerAlertButton']");
}
