import java.util.Random;
import java.util.Scanner;
public class adivina {
    public static void main(String[] args) {
        int num_adivinar;
        Random myrandom = new Random(); // Crea una instancia de la Clase Random
        num_adivinar = myrandom.nextInt(100); // Genera un número entre 0 y 100, sin decimales
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        while (num != num_adivinar) {
            if (num < num_adivinar) {
                System.out.println("Tu numero es menor");
            } else {
                System.out.println("Tu numero es mayor");
            }
            x++;
            num = sc.nextInt();
        }
        System.out.println("Felicidades, adivinaste el numero en " + x + " intentos");
    }
}