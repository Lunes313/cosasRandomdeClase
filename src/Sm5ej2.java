import java.util.Scanner;
public class Sm5ej2 {
    static void convertir(double trm, double num, String moneda) {
        if (moneda.equals("USD")) {
            System.out.println("La cantidad en pesos es: " + String.format("%.2f",(num * trm)));
        } else if (moneda.equals("COP")) {
            System.out.println("La cantidad en dolares es: " + String.format("%.2f",(num / trm)));
        } else {
            System.out.println("Tipo de moneda no valido");
        }//fin if
    }//fin funcion
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de USD a COP y de COP a USD");
        System.out.println("Ingrese el valor a convertir: ");
        double num = scanner.nextDouble();
        System.out.println("Ingrese el tipo de moneda (USD o COP) : ");
        String moneda = scanner.next();
        System.out.println("Ingrese la tasa de cambio: ");
        double trm = scanner.nextDouble();
        convertir(trm,num,moneda);
    }//fin main
}