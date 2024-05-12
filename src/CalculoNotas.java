import java.util.Scanner;
public class CalculoNotas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo de notas");
        System.out.println("Ingrese la nota de los 3 parciales:");
        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();
        double p3 = scanner.nextDouble();
        double promedio = (p1 + p2 + p3) / 3;
        System.out.println("Ingrese la nota del Examen final:");
        double ef = scanner.nextDouble();
        System.out.println("Ingrese la nota del Trabajo final:");
        double tf = scanner.nextDouble();
        System.out.println("Su nota final es: "
                + String.format("%.2f",((promedio*0.6) + (ef*0.3) + (tf*0.1))));
    }
}
