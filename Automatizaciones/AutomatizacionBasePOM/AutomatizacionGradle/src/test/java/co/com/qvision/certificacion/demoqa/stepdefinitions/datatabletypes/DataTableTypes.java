package co.com.qvision.certificacion.demoqa.stepdefinitions.datatabletypes;

import co.com.qvision.certificacion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificacion.demoqa.models.forms.FormData;
import co.com.qvision.certificacion.demoqa.models.services.request.DataServiceModel;
import co.com.qvision.certificacion.demoqa.models.services.responses.BodyUserResponse;
import co.com.qvision.certificacion.demoqa.steps.DemoQAGeneralSteps;
import io.cucumber.java.DataTableType;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class DataTableTypes {
    @Steps
    DemoQAGeneralSteps demoQAGeneralSteps;

    @DataTableType
    public DataServiceModel dataServiceModel(Map<String, String> datos) {
//        List<Map<String, String>> map = CSVTransformer.getRowsCsv("servicio", datos.get("filtro")+","+datos.get("valor"));
        return new DataServiceModel(datos.get("userName"),datos.get("password"));
    }

    @DataTableType
    public OpcionesMenuModel opcionesMenuModel(Map<String, String> datos) {
        return new OpcionesMenuModel(datos.get("La Tarjeta"), datos.get("Seleccionado"));
    }

    @DataTableType
    public FormData datosFormulario(Map<String, String> datos) {
        return new FormData(
                datos.get("Nombre"),
                datos.get("Apellido"),
                datos.get("Email"),
                datos.get("Genero"),
                datos.get("Telefono")
        );
    }

    @DataTableType
    public BodyUserResponse dataServicesResponse(Map<String, String> datos) {
        return new BodyUserResponse(datos.get("code"), datos.get("message"), datos.get("statusCode"));
    }


}
