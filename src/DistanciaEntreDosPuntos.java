import java.util.Scanner;
public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distancia entre dos puntos");
        System.out.println("Ingrese x1:");
        int x1 = scanner.nextInt();
        System.out.println("Ingrese x2:");
        int x2 = scanner.nextInt();
        System.out.println("Ingrese y1:");
        int y1 = scanner.nextInt();
        System.out.println("Ingrese y2:");
        int y2 = scanner.nextInt();
        System.out.println("La distacia es: "
                + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

}
