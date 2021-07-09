package co.com.qvision.certificaion.demoqa.user_interfaces.alerts;

import net.serenitybdd.screenplay.targets.Target;

public class AlertsPageUI {
    public static final Target ALERT_BUTTON
            = Target.the("Botones de Alert")
            .locatedBy("//*[@id='{0}']");
}
