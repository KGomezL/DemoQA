package co.com.qvision.certificaion.demoqa.models;

public class OpcionesMenuModel {
    String opcion;
    String submenu;

    public OpcionesMenuModel(String opcion, String submenu) {
        this.opcion = opcion;
        this.submenu = submenu;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getSubmenu() {
        return submenu;
    }

    public void setSubmenu(String submenu) {
        this.submenu = submenu;
    }
}
