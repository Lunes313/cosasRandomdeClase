import java.util.Scanner;
public class Sm7Ej1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su array: ");
        int x = sc.nextInt();
        System.out.println("Ingrese los valores del array: ");
        int[] arr_int = new int[x];
        for (int i = 0; i < x; i++) {
            arr_int[i] = sc.nextInt()*2;
        }
        for (int i = 0; i < x; i++) {
            System.out.println(arr_int[i]*3);
        }
    }
}
