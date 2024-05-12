import java.util.Scanner;
public class Sm3Eje6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese 3 numeros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && b < c) {
            System.out.println("Ordenados");
        } else {
            System.out.println("Desordenados");
        }
    }
}
