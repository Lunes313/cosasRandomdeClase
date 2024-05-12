import java.util.Scanner;
public class magia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        while (true) {
            System.out.println("Ingresa tu numero: ");
            int i = sc.nextInt();
            if (i == 0) {
                break;
            }
            System.out.println("Tu numero es: " + i);
        }
    }
}
