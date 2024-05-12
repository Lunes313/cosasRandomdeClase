package Semana14.PersonaHerencia;

public class main {
    public static void main(String[] args) {
        PersonaFisica personaFisica = new PersonaFisica("Maria", "Alzate", 2006, "Femenino", "Cr45#2", "123456", "1212818221");
        PersonaJuridica personaJuridica = new PersonaJuridica("Empresa", "SA", 2015, "Masculino", "Cr67#32", "654321", "AS142JK");
        personaFisica.imprimir();
        personaJuridica.imprimir();
    }
}
