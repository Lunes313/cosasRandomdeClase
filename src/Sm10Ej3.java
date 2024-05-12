import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Sm10Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int n = sc.nextInt() ;
        int[] arr = crearArreglo(n);
        ArrayList<Integer> list = convertirArrEstatico(arr);
        imprimirArrDin(list);
    }
    private static void imprimirArrDin(ArrayList<Integer> list) {
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
    private static ArrayList<Integer>  convertirArrEstatico(int[] arr) {
        ArrayList<Integer> listita = new ArrayList<Integer>();
        for(int i: arr) {
            listita.add(i);
        }
        return listita;
    }
    private static int[] crearArreglo(int n) {
        int[] list = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++) {
            list[i] = r.nextInt(100);
        }
        return list;
    }
}
