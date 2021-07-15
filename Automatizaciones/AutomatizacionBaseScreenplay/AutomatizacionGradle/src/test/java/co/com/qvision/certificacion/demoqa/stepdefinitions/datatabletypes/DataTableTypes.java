package co.com.qvision.certificacion.demoqa.stepdefinitions.datatabletypes;

import co.com.qvision.certificaion.demoqa.models.OpcionesMenuModel;
import co.com.qvision.certificaion.demoqa.models.alerts.OpcionBotonModel;
import co.com.qvision.certificaion.demoqa.models.forms.FormDataModel;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableTypes {
    @DataTableType
    public OpcionesMenuModel opcionesMenuModel(Map<String, String> datos) {
        return new OpcionesMenuModel(datos.get("La Tarjeta"), datos.get("Seleccionado"));
    }

    @DataTableType
    public FormDataModel datosFormulario(Map<String, String> datos) {
        return new FormDataModel(
                datos.get("Nombre"),
                datos.get("Apellido"),
                datos.get("Genero"),
                datos.get("Email"),
                datos.get("Telefono"),
                datos.get("Fecha"),
                datos.get("Subjects"),
                datos.get("CurrentAdd"),
                datos.get("State"),
                datos.get("City")
        );
    }

    @DataTableType
    public OpcionBotonModel opcionBotonModel(Map<String, String> boton) {
        return new OpcionBotonModel(boton.get("Boton")
        );
    }
}
