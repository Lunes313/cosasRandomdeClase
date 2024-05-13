package Semana14.PersonaEjercicio;

public class Persona {
    private String nombre;
    private String apellido;
    private int documento;
    private int añoNacimiento;
    public Persona(String nombre, String apellido, int documento, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.añoNacimiento = añoNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDocumento() {
        return documento;
    }
    public int getAñoNacimiento() {
        return añoNacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Año de nacimiento: " + añoNacimiento);
    }

}
