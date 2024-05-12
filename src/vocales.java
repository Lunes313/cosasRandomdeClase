import java.util.Scanner;
public class vocales {

    private static int contarVocales(String texto) {
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c =='a' || c =='e' || c =='i' || c =='o' || c =='u') {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String texto = sc.nextLine();
        texto = texto.toLowerCase();
        System.out.println("La cantidad de vocales es: " + contarVocales(texto));
    }
}
