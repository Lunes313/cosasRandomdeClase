import java.util.Scanner;
public class SueldoTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es su sueldo base?");
        double sueldo = scanner.nextDouble();
        System.out.println("Su comisión es de : " + String.format("%.2f",sueldo * 0.1 * 3) + " y su sueldo total es de : "
                + String.format("%.2f",(sueldo + (sueldo * 0.1 * 3))));

    }
}
