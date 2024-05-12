import java.util.Scanner;
public class MovimientoUniforme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la velocidad 1: ");
        int v1 = scanner.nextInt();
        System.out.print("Ingrese la velocidad 2: ");
        int v2 = scanner.nextInt();
        System.out.print("Ingrese la distancia: ");
        int d = scanner.nextInt();
        System.out.print("El tiempo en el que el auto 2 alcanza al auto 1 es: "
                + (d/(v2-v1))*60 + " minutos");
    }
}
