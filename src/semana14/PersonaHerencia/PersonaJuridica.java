package PersonaHerencia;

public class PersonaJuridica extends PersonaHerencia {
    private String NIT;

    public PersonaJuridica(String Nombre, String Apellido, int Edad, String Genero, String Direccion, String Telefono,
            String NIT) {
        super(Nombre, Apellido, Edad, Genero, Direccion, Telefono);
        this.NIT = NIT;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Como persona juridica y numero de NIT: "+NIT);
    }
}
