import java.util.Scanner;
public class Sm3Eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 números enteros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a+b)==c) {
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }
    }
}
