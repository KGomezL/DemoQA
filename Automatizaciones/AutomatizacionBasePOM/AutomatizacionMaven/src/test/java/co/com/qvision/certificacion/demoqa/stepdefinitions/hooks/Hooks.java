package co.com.qvision.certificacion.demoqa.stepdefinitions.hooks;


import co.com.qvision.certificacion.demoqa.steps.DemoQAGeneralSteps;
import io.cucumber.java.Before;
import net.thucydides.core.annotations.Steps;

public class Hooks {
    //Practice Form
    @Steps
    DemoQAGeneralSteps demoQAGeneralSteps;

    @Before(value = "@practiceForm", order = 0)
    public void abrirNavegador() {
       demoQAGeneralSteps.abrirPaginaDemoQA();
    }

}
