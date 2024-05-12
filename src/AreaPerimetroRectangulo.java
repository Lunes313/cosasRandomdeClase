import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area y perimetro de un rectangulo");
        int num1;
        int num2;
        System.out.println("Ingrese la longitud del rectangulo: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el ancho del rectangulo : ");
        num2 = scanner.nextInt();
        System.out.println("El area del rectangulo es : " + (num1 * num2));
        System.out.println("El perimetro del rectangulo es : " + (2 * (num1 + num2)));
    }
}
