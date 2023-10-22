package javaapplication6;

public class clsCompetidor1kcc {

    String cedula;
    String nombre;
    String apellido;
    int anionacimiento;
    String rh;
    String idmoto;
    int tiempo;
    int cilindraje;
    String tipo;

    public clsCompetidor1kcc() {
        this.cedula = null;
        this.nombre = null;
        this.apellido = null;
        this.anionacimiento = 0;
        this.rh = null;
        this.idmoto = null;
        this.tiempo = 0;
        this.cilindraje = 1000;
        this.tipo = null;
    }

    public clsCompetidor1kcc(String cedula, String nombre, String apellido, int anionacimiento, String rh, String idmoto, int tiempo, String tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anionacimiento = anionacimiento;
        this.rh = rh;
        this.idmoto = idmoto;
        this.tiempo = tiempo;
        this.cilindraje = 1000;
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public int getAnionacimiento() {
        return anionacimiento;
    }

    public void setAnionacimiento(int anionacimiento) {
        this.anionacimiento = anionacimiento;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getIdmoto() {
        return idmoto;
    }

    public void setIdmoto(String idmoto) {
        this.idmoto = idmoto;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
