import java.util.Scanner;
public class Sm5Ej11 {
        private static int contarLetras(String texto) {
            int cont = 0;
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    cont++;
                }
            }
            return cont;
        }
        private static int contarDigitos(String texto) {
            int cont = 0;
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                if (c >= '0' && c <= '9') {
                    cont++;
                }
            }
            return cont;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el texto: ");
            String texto = sc.nextLine();
            texto = texto.toLowerCase();
            System.out.println("La cantidad de caracteres es: " + contarLetras(texto));
            System.out.println("La cantidad de digitos es: " + contarDigitos(texto));
        }

}


