package Semana3;

import java.util.Scanner;
public class Sm3Eje9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        if(anio%4==0 && (anio%100!=0 || anio%400==0)){
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }

}
