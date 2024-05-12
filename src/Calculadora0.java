import java.util.Scanner;

public class Calculadora0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        double num1;
        double num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble();
        System.out.println("La suma es : " + (num1 + num2));
        System.out.println("La resta es : " + (num1 - num2));
        System.out.println("La multiplicación es : " + (num1 * num2));
        System.out.println("La división es : " + String.format("%.3f",num1/num2));
    }
}
