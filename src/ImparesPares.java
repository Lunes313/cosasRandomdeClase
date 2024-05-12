import java.util.Scanner;
public class ImparesPares {
    private static int pares(String num) {
        int cont = 0;
        for (int i = 0; i < num.length(); i++) {
            char a = num.charAt(i);
            int b = Character.getNumericValue(a);
            if (b%2==0) {
                cont++;
            }
        }
        return cont;
    }
    private static int imp(String num) {
        int cont = 0;
        for (int i = 0; i < num.length(); i++) {
            char a = num.charAt(i);
            int b = Character.getNumericValue(a);
            if (b%2!=0) {
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número que no contenga mas de 10 digitos:");
        String num = sc.nextLine();
        if(num.length() >= 0 && num.length() <= 10){
            System.out.println("Su numero tiene: " + num.length() + " dígitos");
            System.out.println("La cantidad de pares es: " + pares(num) + "\nLa cantidad de Impares es: " + imp(num));
        }else {
            System.out.println("El número ingresado no es válido");
        }

    }
}
