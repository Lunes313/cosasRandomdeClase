import java.util.Scanner;
public class ConversorCOPtoUsd {
    static double dolartopesos(double trm, double num) {
        double a = num * trm;
        return a;
    }//fin dolartopesos
    static double pesostodolar(double trm, double num) {
        double a = num / trm;
        return a;
    }//finpesostodolar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de USD a COP y de COP a USD");
        System.out.println("Ingrese el valor a convertir: ");
        double num = scanner.nextDouble();
        System.out.println("Ingrese el tipo de moneda (USD o COP) : ");
        String moneda = scanner.next();
        System.out.println("Ingrese la tasa de cambio: ");
        double trm = scanner.nextDouble();
        if (moneda.equals("USD")) {
            System.out.println("La cantidad en pesos es:" + String.format("%.2f",(dolartopesos(trm,num))));
        } else if (moneda.equals("COP")) {
            System.out.println("La cantidad en dolares es: " + String.format("%.2f",(pesostodolar(trm,num))));
        } else {
            System.out.println("Tipo de moneda no valido");
        }//fin if
    }//fin main
}