import java.util.Scanner;
public class Sm5ej3 {
    static void convertir(double d) {
        double a;
        a = d * 1.13;
        System.out.println("Su valor en dolares es: " + String.format("%.2f",(a)));
        a = a * 3933.36;
        System.out.println("Su valor en COP es: " + String.format("%.2f",(a)));
        a = a -(a*0.05);
        System.out.println("Luego del descuento a su cuenta ingresaron: " +  String.format("%.2f",(a)) + " COP");
    }//fin funcion
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor pagado en (CHF) : ");
        double dinero = scanner.nextDouble();
        convertir(dinero);
    }//fin main
}

