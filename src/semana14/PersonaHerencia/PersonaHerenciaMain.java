package PersonaHerencia;

public class PersonaHerenciaMain {
    public static void main(String[] args) {
        PersonaFisica persona1 = new PersonaFisica("Maria","Castrillon", 14, "Femenino", "Calle 19", "3105081615", "2345S");
        PersonaJuridica persona2 = new PersonaJuridica("Salome","Castrillon", 17, "Femenino", "Calle 192", "3105081615", "234455");
        persona1.imprimir();
        persona2.imprimir();
       
    }
}
