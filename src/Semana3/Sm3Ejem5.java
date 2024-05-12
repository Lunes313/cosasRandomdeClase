package Semana3;

import java.util.Scanner;
public class Sm3Ejem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b % a == 0) {
          System.out.println("a es divisor entero de b");
        } else {
          System.out.println("a no es divisor entero de b");
        }
    }
}
