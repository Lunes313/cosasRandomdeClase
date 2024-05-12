//Laura Andrea Castrillón Fajardo

public class PersonaP {
    private String nombre;
    private String apellido;
    private int id;
    private int edad;

    public PersonaP(String nombre, String apellido, int id, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
