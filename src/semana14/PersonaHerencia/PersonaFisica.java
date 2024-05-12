package Semana14.PersonaHerencia;

public class PersonaFisica extends Persona {
        private String Identidad;
        public PersonaFisica(String Nombre, String Apellido, int añoNacimiento, String Genero, String Direccion, String Telefono, String identidad) {
            super(Nombre, Apellido, añoNacimiento, Genero, Direccion, Telefono);
            this.Identidad = identidad;
        }

        public void imprimir() {
            super.imprimir();
            System.out.println("Como persona fisica y numero de id: " + Identidad);
        }
    }

