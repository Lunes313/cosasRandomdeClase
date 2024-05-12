import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convertir de grados Fahrenheit a Celsius");
        double grados;
        System.out.println("Ingrese los grados(Fahrenheit) : ");
        grados = scanner.nextDouble();
        System.out.println("Celsius:" + String.format("%.3f",(((grados) - 32)*5/9)));

    }
}
