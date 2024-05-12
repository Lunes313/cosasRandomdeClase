//Laura Restrepo Berrio
//Fecha: 10/11/2020
//Semana 12 Ejercicio 9
import java.util.Scanner;
public class Semana12ej9 {
    static Scanner sc = new Scanner(System.in);
    private static void quickSort(int[] arr, int indiceInicio, int indiceFin) {
        if (indiceInicio < indiceFin) {
            int indicePivote = particion(arr, indiceInicio, indiceFin);
            quickSort(arr, indiceInicio, indicePivote - 1);
            quickSort(arr, indicePivote + 1, indiceFin);
        }
    }
    private static int particion(int[] arr, int indiceInicio, int indiceFin) {
        int pivote = arr[indiceInicio];
        int i = indiceInicio;
        for (int j = indiceInicio + 1; j <= indiceFin; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[indiceInicio];
        arr[indiceInicio] = temp;
        return i;
    }
    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Arreglo original:");
        imprimirArreglo(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arr);

        while(true){
            System.out.println("Ingrese el valor a buscar o -1 para salir: ");
            int valor = sc.nextInt();
            if(valor == -1){
                break;
            }
            int posicion = busquedaBinaria(arr, valor);
            System.out.println("El valor se encuentra en la posicion: " + posicion);
        }

    }
    public static int busquedaBinaria(int[] lista, int valor){
        int inicio = 0;
        int fin = lista.length - 1;
        while(inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            if(lista[medio] == valor){
                return medio;
            }
            if(lista[medio] < valor){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        }
        return -1;
    }

}
