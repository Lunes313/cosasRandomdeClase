import java.util.Scanner;
public class Sm5ej14 {
    public static double obtenerIntereses(double precio, double tiempo) {
        double interes = precio * 0.8 * tiempo;
        return interes;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el presio del apartamento:");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese el tiempo de pago:");
        double tiempo = scanner.nextInt();
        System.out.println("Su interes es de: " + obtenerIntereses(precio, tiempo));
    }
}
