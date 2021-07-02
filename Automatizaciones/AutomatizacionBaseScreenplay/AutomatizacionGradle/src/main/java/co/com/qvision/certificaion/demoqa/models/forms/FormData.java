package co.com.qvision.certificaion.demoqa.models.forms;

public class FormData {
    String nombre;
    String apellido;
    String genero;
    String correo;
    String telefono;
    String fecha;
    String subjects;
    String currentAdd;
    String state;
    String city;

    public FormData(String nombre, String apellido, String genero, String correo, String telefono, String fecha, String subjects, String currentAdd, String state, String city) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha = fecha;
        this.subjects = subjects;
        this.currentAdd = currentAdd;
        this.state = state;
        this.city = city;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getCurrentAdd() {
        return currentAdd;
    }

    public void setCurrentAdd(String currentAdd) {
        this.currentAdd = currentAdd;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

