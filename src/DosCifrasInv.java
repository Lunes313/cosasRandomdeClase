import java.util.Scanner;
public class DosCifrasInv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un numero de 2 cifras:");
        int num;
        num = scanner.nextInt();
        System.out.println((num%10) + "" + (num/10));

    }
}
