import java.util.Scanner;
import java.util.ArrayList;
import  java.util.Random;
public class Metodos {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        //ArrayList
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        System.out.println(String.join(" ", lista ));
        System.out.println(lista.get(0));
        System.out.println(lista.contains("a"));
        System.out.println(lista.indexOf("a"));
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        lista.set(0, "z");
        System.out.println(String.join(" ", lista ));
        lista.remove(0);
        System.out.println(String.join(" ", lista ));
        lista.clear();
        System.out.println(String.join(" ", lista ));
        System.out.println(lista.isEmpty());
        //Random
        Random rand = new Random();
        System.out.println(rand.nextInt(10));
        System.out.println(rand.nextDouble());
        //Math
        System.out.println(Math.abs(-10));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.round(3.5));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.floor(3.9));
        System.out.println(Math.max(3,5));
        System.out.println(Math.min(3,5));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //String
        String s = "Hola Mundo";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.substring(0,4));
        System.out.println(s.indexOf("Mundo"));
        System.out.println(s.equals("Hola Mundo"));
        System.out.println(s.equalsIgnoreCase("hola mundo"));
        System.out.println(s.startsWith("Hola"));
        System.out.println(s.endsWith("Mundo"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace("Mundo", "Universo"));
        System.out.println(s.trim());
        System.out.println(s.split(" ")[0]);
        System.out.println(s.concat(" Feliz"));
        System.out.println(s + " Feliz");
        //Scanner
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("El numero es: " + num);
        System.out.println("Ingrese un decimal: ");
        double decimal = sc.nextDouble();
        System.out.println("El decimal es: " + decimal);
        System.out.println("Ingrese un texto: ");
        String texto = sc.next();
        System.out.println("El texto es: " + texto);

    }
}