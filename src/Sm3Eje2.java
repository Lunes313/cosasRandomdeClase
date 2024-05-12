import java.util.Scanner;
public class Sm3Eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nota: ");
        double nota = sc.nextDouble();
        if (nota == 5) {
            System.out.println("Excelente");
        } else if(nota <= 4.9 && nota >= 4.5) {
            System.out.println("Muy Bien");
        } else if(nota <= 4.4 && nota >= 4) {
            System.out.println("Bien");
        } else if(nota <= 3.9 && nota >= 3) {
            System.out.println("Regular");
        } else if(nota < 3 && nota >= 1.5) {
            System.out.println("Mal");
        } else if(nota < 1.5 && nota >= 0) {
            System.out.println("Muy Mal");
        } else {
            System.out.println("Nota no válida");
        }
    }
}
