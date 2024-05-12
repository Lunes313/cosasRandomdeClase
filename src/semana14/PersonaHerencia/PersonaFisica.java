package PersonaHerencia;

public class PersonaFisica extends PersonaHerencia {

        private String Identidad;

        public PersonaFisica(String Nombre, String Apellido, int Edad, String Genero, String Direccion,
                String Telefono,
                String NIT) {
            super(Nombre, Apellido, Edad, Genero, Direccion, Telefono);
            this.Identidad = NIT;
        }

        public void imprimir() {
            super.imprimir();
            System.out.println("Como persona fisica y numero de id: " + Identidad);
        }
    }

