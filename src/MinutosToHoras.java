import java.util.Scanner;
public class MinutosToHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de minutos a horas");
        System.out.println("Ingrese los minutos :");
        int min = scanner.nextInt();
        System.out.println(min/60 + " horas y " + min%60 + " minutos");
    }
}
