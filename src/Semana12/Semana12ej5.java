//Laura Restrepo Berrio
//Fecha: 10/11/2020
//Semana 12 Ejercicio 5
public class Semana12ej5 {
        // Método principal de Quicksort
        private static void quickSort(int[] arr, int indiceInicio, int indiceFin) {
            if (indiceInicio < indiceFin) {
                // Obtener el índice del pivote después de la partición
                int indicePivote = particion(arr, indiceInicio, indiceFin);
                // Recursivamente ordenar los elementos antes y después del pivote
                quickSort(arr, indiceInicio, indicePivote - 1);
                quickSort(arr, indicePivote + 1, indiceFin);
            }
        }

    // Método para realizar la partición del arreglo y devolver el índice del pivote
    private static int particion(int[] arr, int indiceInicio, int indiceFin) {
        int pivote = arr[indiceFin]; // Elegir el último elemento como pivote
        int i = indiceInicio - 1; // Índice del elemento más pequeño

        for (int j = indiceInicio; j < indiceFin; j++) {
            // Si el elemento actual es menor o igual al pivote, intercambiarlo con el siguiente elemento más pequeño
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // si el elemenento mas pequeño es mayor que el pivote se intercambian
        int temp = arr[i + 1];
        arr[i + 1] = arr[indiceFin];
        arr[indiceFin] = temp;
        return i + 1; // Devolver el índice del pivote
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Método principal (para probar la implementación)
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Arreglo original:");
        imprimirArreglo(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arr);
    }
}