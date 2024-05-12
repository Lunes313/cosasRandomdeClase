import java.util.Scanner;
public class Sm3Eje4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 números enteros a, b y c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a+b)==c) {
            System.out.println(c + " es igual a a + b");
        } else if((a+c)==b){
            System.out.println(b + " es igual a a + c");
        } else if((b+c)==a){
            System.out.println(a + " es igual a b + c");
        } else {
            System.out.println("Diferentes");
        }
    }
}