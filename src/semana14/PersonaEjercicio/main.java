package Semana14.PersonaEjercicio;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 14 Clase Persona
import java.util.Scanner;
public class main {
    static Scanner sc = new Scanner(System.in);
    static ArregloPersonas personas = new ArregloPersonas();
    public static void main(String[] args) {
        //creamos 2 personas con su atributos
        Persona p1 = new Persona("Laura", "Restrepo", 123456, 1990);
        Persona p2 = new Persona("Luis", "Lopez", 987654, 1970);
        //imprimimos los datos de las personas
        p1.imprimir();
        p2.imprimir();
        int i = 0;
        String respuesta = "";
        while (i < 10) {
            System.out.println("Quieres añadir una persona? (si/no)");
            respuesta = sc.nextLine();
            if (respuesta.equals("si")) {
                añañirPersona();
            }else{
                break;
            }
            i++;
        };

        System.out.println("Quiere buscar a alguien? (si/no)");
        respuesta = sc.nextLine();
        if (respuesta.equals("si")) {
            System.out.println("Ingrese el documento: ");
            int documento = sc.nextInt();
            personas.buscarPorIdentificacion(documento);
        }

        System.out.println("Quiere buscar a alguien por año de nacimiento? (si/no)");
        respuesta = sc.nextLine();
        if (respuesta.equals("si")) {
            System.out.println("Ingrese el año de nacimiento: ");
            int año = sc.nextInt();
            personas.buscarPorAnio(año);
        }
        System.out.println("Quiere imprimir a las personas? (si/no)");
        respuesta = sc.nextLine();
        if (respuesta.equals("si")) {
            personas.imprimir();
        }
    }
    private static void añañirPersona() {
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el documento: ");
        int documento = sc.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int año = sc.nextInt();
        Persona persona = new Persona(nombre, apellido, documento, año);
        persona.imprimir();
        personas.adicionar(persona);
    }
}
