import java.util.Scanner;
public class calcularPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular promedio");
        System.out.println("Ingrese 3 numeros:");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        System.out.println("El promedio es: " + String.format("%.3f", (n1+n2+n3)/3));
    }

}
