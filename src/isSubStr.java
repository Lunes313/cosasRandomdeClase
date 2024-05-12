import java.util.Scanner;
public class isSubStr {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un string: ");
        String str = sc.nextLine();
        System.out.println("Ingrese otro String: ");
        String sub = sc.nextLine();
        if (str.contains(sub)) {
            System.out.println("El String ingresado es un substring del primero.");
        } else {
            System.out.println("El String ingresado no es un substring.");
        }
    }
}
