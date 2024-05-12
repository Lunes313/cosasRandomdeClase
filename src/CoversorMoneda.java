import java.util.Scanner;
public class CoversorMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de USD a COP y de COP a USD");
        System.out.println("Ingrese el valor a convertir: ");
        double num = scanner.nextInt();
        System.out.println("Ingrese el tipo de moneda (USD o COP) : ");
        String moneda = scanner.next();
        if (moneda.equals("USD")) {
            System.out.println( num + " USD" + " = "
                    + String.format("%.2f",(num * 3900.11)) + " COP");
        } else if (moneda.equals("COP")) {
            System.out.println( num + " COP" + " = "
                    + String.format("%.2f",(num / 3900.11)) + " USD");
        } else {
            System.out.println("Tipo de moneda no valido");
        }
    }
}
