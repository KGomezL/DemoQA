package co.com.qvision.certificaion.demoqa.user_interfaces.elements.radiobutton;

import net.serenitybdd.screenplay.targets.Target;

public class RadioButtonPage {
    public static final Target HEADER
            = Target.the("Header Radio Button")
            .locatedBy("//div[contains(@class, 'pattern-backgound playgound-header')] ");

    public static final Target RADIO_BUTTON_YES
            = Target.the("Radio Button Yes")
            .locatedBy("//label[contains(@for, 'yesRadio') and @class='custom-control-label']");

    public static final Target RADIO_BUTTON_IMP
            = Target.the("Radio Button Impressive")
            .locatedBy("//label[contains(@for, 'impressiveRadio') and @class='custom-control-label']");

    public static final Target RADIO_BUTTON_NO
            = Target.the("Radio Button No")
            .locatedBy("//input[(@type='radio')and @id='noRadio']");
}
