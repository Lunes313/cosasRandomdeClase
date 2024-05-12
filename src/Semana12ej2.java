//Laura Restrepo Berrio
//Fecha: 10/11/2020
//Semana 12 Ejercicio 1
public class Semana12ej2 {
    public static void main(String[] args) {
        //Se crea un arreglo de enteros desordenado
        int[] arr = {64, 25, 12, 22, 11, 1, 4, 3, 99, 7, 23, 10};
        //algoritmo de bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int elemento = arr[j];
                int siguiente = arr[j + 1];
                if (elemento > siguiente) {
                    arr[j] = siguiente;
                    arr[j + 1] = elemento;
                }
            }
            //inicializamos una variable de ordenado en true
            boolean ordenado = true;
            for (int j = 0; j < arr.length - 1; j++) {
                //recorre el arreglo y preguntamos si el elemento actual es mayor al siguiente
                if (arr[j] > arr[j + 1]) {
                    //si es mayor, cambiamos la variable de ordenado a false y rompemos el ciclo
                    ordenado = false;
                    break;
                }
            }
            //preguntamos si esta ordenado luego de recorrer el arreglo
            if (ordenado) {
                //si esta ordenado, rompemos el ciclo
                break;
            }
            //imprimimos cada iteracion para ver el funcionamiento
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
