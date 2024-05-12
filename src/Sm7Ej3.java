import java.util.Scanner;
public class Sm7Ej3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero par: ");
        int n = sc.nextInt();
        int[] arr_int = new int[n];
        for (int i = 0; i < n; i++) {
            arr_int[i] = sc.nextInt();
        }
        int c = 0;
        double[] arr2 = new double[n/2];
        for (int i = 0; i < n/2; i++) {
            double prom = (((double)(arr_int[c])+(double)(arr_int[c+1]))/2);
            arr2[i] = prom;
            c += 2;
        }
        for (int i = 0; i < n/2; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
