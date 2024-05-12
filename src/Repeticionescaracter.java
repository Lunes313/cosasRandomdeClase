import java.util.Scanner;
public class Repeticionescaracter {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un string: ");
        String str = sc.nextLine();
        System.out.println("Ingrese un caracter: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Se repite " + count + " veces.");
    }
}
