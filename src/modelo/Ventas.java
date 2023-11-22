package modelo;


public class Ventas {
    private String nombre;
    private String apellido;
    private String totalventa;
    private String igvventa;

    public Ventas(String nombre, String apellido, String totalventa, String igvventa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.totalventa = totalventa;
        this.igvventa = igvventa;
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

    public String getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(String totalventa) {
        this.totalventa = totalventa;
    }

    public String getIgvventa() {
        return igvventa;
    }

    public void setIgvventa(String igvventa) {
        this.igvventa = igvventa;
    }   
}
