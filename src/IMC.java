import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indice de masa corporal");
        double peso;
        System.out.println("Ingrese su peso en kilogramos : ");
        peso = scanner.nextDouble();
        double altura;
        System.out.println("Ingrese su altura en metros : ");
        altura = scanner.nextDouble();
        System.out.println("Su indice de masa corporal es : " + (peso / (altura* altura)));

    }
}
