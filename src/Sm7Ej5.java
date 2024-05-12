import java.util.Scanner;
public class Sm7Ej5 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Ingrese los valores del array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Arreglo invertido: ");
        int c, b;
        for (int i = 0; i < n/2; i++) {
            c = array[i];
            b = array[n-1-i];
            array[i] = b;
            array[n-1-i] = c;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" "+ array[i]);
        }
    }
}

