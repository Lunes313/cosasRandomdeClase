package Semana10;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Sm10Ej4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int n = sc.nextInt() ;
        ArrayList<Integer> list = crearArreglo(n);
        int[] arr =  convertirArrDinamico(list);
        imprimirArrEst(arr);
    }
    private static void imprimirArrEst(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static int[] convertirArrDinamico(ArrayList<Integer> list) {
        int[] listita = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            listita[i] = list.get(i);
        }
        return listita;
    }
    private static ArrayList<Integer> crearArreglo(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < n; i++) {
            list.add(r.nextInt(100));
        }
        return list;
    }
}




