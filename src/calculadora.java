import java.util.Scanner;
public class calculadora {
    public static void menu(double num1, double num2, int opcion) {
        if(opcion == 1) {
            System.out.println("La suma es: " + (num1 + num2));
        } else if(opcion == 2) {
            System.out.println("La resta es: " + (num1 - num2));
        } else if(opcion == 3) {
            System.out.println("La multiplicación es: " + (num1 * num2));
        } else if(opcion == 4) {
            System.out.println("La división es: " + (num1 / num2));
        } else if(opcion == 5) {
            System.out.println("La raiz de " + num1 + " es: " + Math.sqrt(num1));
            System.out.println("La raiz de " + num2 + " es: " + Math.sqrt(num2));
        } else if(opcion == 6) {
            System.out.println("La potencia de " + num1 + " es: " + Math.pow(num1, num2));
            System.out.println("La potencia de " + num2 + " es: " + Math.pow(num2, num1));
        } else {
            System.out.println("Opción no valida \n saliendo...");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Ingrese la operación que desea realizar" +
                "\n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División \n 5. Raiz \n 6. potencia");
        int opcion = sc.nextInt();
        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();
        menu(num1, num2, opcion);
    }
}