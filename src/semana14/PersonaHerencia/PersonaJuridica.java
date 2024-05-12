package Semana14.PersonaHerencia;

public class PersonaJuridica extends Persona {
    private String NIT;

    public PersonaJuridica(String Nombre, String Apellido, int añoNacimiento, String Genero, String Direccion, String Telefono,
            String NIT) {
        super(Nombre, Apellido, añoNacimiento, Genero, Direccion, Telefono);
        this.NIT = NIT;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Como persona juridica y numero de NIT: "+NIT);
    }
}
