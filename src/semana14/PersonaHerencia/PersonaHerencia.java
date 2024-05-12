package PersonaHerencia;

public class PersonaHerencia {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Genero;
    private String Direccion;
    private String Telefono;

    public PersonaHerencia(String Nombre, String Apellido, int Edad, String Genero, String Direccion, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void imprimir() {
        System.out.println(Nombre + " " + Apellido + "tiene " + Edad + " De Genero" + Genero
                + " Con direccion " + Direccion + " Y telefono " + Telefono);

    }
}
