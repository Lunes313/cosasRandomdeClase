import java.util.Scanner;
public class Ciclo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int i = sc.nextInt();
        while (i > 0) {
        System.out.println(i);
        i--;
        }
        for(int j = i; j <= 5; j++) {
            System.out.println(j);
        }
    }
}
