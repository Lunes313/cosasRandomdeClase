
import java.util.Scanner;
public class InteresCompuesto {
    //Calculadora de interes compuesto
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de interes compuesto");
        System.out.println("Ingrese el monto principal : ");
        double principal;
        principal = scanner.nextDouble();
        System.out.println("Ingrese la tasa de interes : ");
        double tasa;
        tasa = scanner.nextDouble();
        System.out.println("Ingrese el numero de años : ");
        int años;
        años = scanner.nextInt();
        System.out.println("SU tasa de interes compuesto es : " + (String.format("%.2f",principal*(Math.pow((1+(tasa/100)),años)))));

    }
}
