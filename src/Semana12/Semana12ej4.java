package Semana12;

//Laura Restrepo Berrio
//Fecha: 10/11/2020
//Semana 12 Ejercicio 4
public class Semana12ej4 {
    public static void main(String[] args) {
        //Se crea un arreglo de enteros desordenado
        int[] arr = {64, 25, 12, 22, 11, 1, 4, 3, 99, 7, 23, 10};
        //Se imprime el arreglo desordenado
        System.out.println("Arreglo desordenado");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //Se ordena el arreglo
        mergeSort(arr, 0, arr.length - 1);
        //Se imprime el arreglo ordenado
        System.out.println("\nArreglo ordenado");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            //Encuentra el punto medio del arreglo
            int m = (l + r) / 2;
            //Ordena la primera mitad
            mergeSort(arr, l, m);
            //Ordena la segunda mitad
            mergeSort(arr, m + 1, r);
            //Combina las mitades ordenadas
            merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r) {
        //Encuentra el tamaño de los subarreglos
        int n1 = m - l + 1;
        int n2 = r - m;
        //Crea arreglos temporales
        int[] L = new int[n1];
        int[] R = new int[n2];
        //Copia los datos a los arreglos temporales
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        //Inicializa los indices de los subarreglos
        int i = 0, j = 0;
        //Inicializa el indice del arreglo fusionado
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //Copia los elementos restantes de L[] si hay
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        //Copia los elementos restantes de R[] si hay
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
