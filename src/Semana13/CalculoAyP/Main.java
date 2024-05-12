package Semana13.CalculoAyP;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 13 Ejercicio 2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base de su rectangulo: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese la altura de su rectangulo: ");
        int altura = scanner.nextInt();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        System.out.println("Area: " + rectangulo.getArea());
        System.out.println("Perimetro: " + rectangulo.getPerimetro());
    }
}
