import java.util.Scanner;
public class Sm7Ej2 {
    public static int[] reverse(int[] array, int n) {
        int[] rever = new int[n];
        for(int i = n-1; i >=0;i--){
            rever[n-1-i]=array[i];
        }
        return rever;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Ingrese los valores del array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int[] rever = reverse(array, n);
        System.out.print("Arreglo original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(" ");
        System.out.print("Arreglo invertido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+ rever[i]);
        }
    }
}
