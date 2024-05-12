import java.util.Scanner;
public class Sm3Eje12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de dos cifras: ");
        int num = sc.nextInt();
        if (num > 10 && num < 99) {
            if((num % 10) % 2 == 0) {
                if((num / 10) % 2 == 0) {
                    System.out.println("Los dos digitos son pares");
                } else {
                    System.out.println("Solo " + num % 10 + " es par");
                }
            } else if((num / 10) % 2 == 0) {
                System.out.println("Solo " + num /10 + " es par");
            } else {
                System.out.println("Ningun digito es par");
            }
        } else {
            System.out.println("El numero no tiene 2 cifras.");
        }

    }
}
