package Semana3;

import java.util.Scanner;
public class Sm3Eje7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese 3 numeros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println("a b c");
            } else if (a < c) {
                System.out.println("a c b");
            } else {
                System.out.println("c a b");
            }
        } else {
            if (a < c) {
                System.out.println("b a c");
            } else if (b < c) {
                System.out.println("b c a");
            }else {
                System.out.println("c b a");
            }
        }
    }
}

