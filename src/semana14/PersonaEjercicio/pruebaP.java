
public class pruebaP {

    public static void main(String[] args) {
        ArregloPersonas list = new ArregloPersonas();
        PersonaP maria = new PersonaP("Maria", "Alzate", 1097185455, 2006);
        PersonaP mario = new PersonaP("Mario", "Alzate", 1035895432, 2004);
        PersonaP marie = new PersonaP("Marie", "Alzate", 1035892534, 2004);
        list.agregarPersonas(mario);
        list.agregarPersonas(maria);
        list.agregarPersonas(marie);
        list.imprimirInformacion();
        list.buscarPersonaID(1097185455);
        list.buscarPersonasAno(2004);

    }
}
