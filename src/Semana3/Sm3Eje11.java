package Semana3;

import java.util.Scanner;
public class Sm3Eje11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una opcion \n (1)Celsius \n (2)Fahrenheit \n (3)Kelvin");
        int opcion = sc.nextInt();
        System.out.print("Introduzca la temperatura: ");
        double tem = sc.nextDouble();
        if(opcion == 1){
            System.out.println("Fahrenheit: " + String.format("%.3f",(tem * 9/5 + 32)));
            System.out.println("Kelvin: " + String.format("%.3f",(tem + 273.15)));
        }else if(opcion == 2){
            System.out.println("Celsius: " + String.format("%.3f",((tem - 32) * 5/9)));
            System.out.println("Kelvin: " + String.format("%.3f",((tem - 32) * 5/9 + 273.15)));
        } else if (opcion == 3) {
            System.out.println("Celsius: " + String.format("%.3f",(tem - 273.15)));
            System.out.println("Fahrenheit: " + String.format("%.3f",((tem - 273.15) * 9/5 + 32)));
        }
    }
}
