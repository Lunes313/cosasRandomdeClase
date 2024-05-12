package Semana14.PersonaHerencia;

public class Persona{
    private String Nombre;
    private String Apellido;
    private int AñoNacimiento;
    private int Edad;
    private String Genero;
    private String Direccion;
    private String Telefono;


    public Persona(String nombre, String apellido, int añoNacimiento, String genero, String direccion, String telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Genero = Genero;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.AñoNacimiento = añoNacimiento;
        calcularEdad();
    }

    public void cambiarNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void cambiarApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void calcularEdad() {
        this.Edad = 2024 - AñoNacimiento;
    }

    public void imprimir() {
        System.out.println(Nombre + " " + Apellido + "tiene " + Edad + " De Genero" + Genero
                + " Con direccion " + Direccion + " Y telefono " + Telefono);

    }
}
