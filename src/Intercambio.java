import java.util.Scanner;
public class Intercambio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero A: ");
        int numA = scanner.nextInt();
        System.out.print("Ingrese el numero B: ");
        int numB = scanner.nextInt();
        int c = numA;
        numA = numB;
        numB = c;
        System.out.println("El valor de A es: " + numA);
        System.out.println("El valor de B es: " + numB);
    }


}
