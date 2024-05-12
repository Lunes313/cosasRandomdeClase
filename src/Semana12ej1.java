//Laura Restrepo Berrio
//Fecha: 10/11/2020
//Semana 12 Ejercicio 1
public class Semana12ej1 {
    public static void main(String[] args) {
        //Se crea un arreglo de enteros desordenado
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            //Se busca el elemento mas pequeño en el arreglo
            int minimo = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minimo]) {
                    minimo = j;
                }
            }
            //Se intercambian los elementos con una variable temporal
            int variable = arr[minimo];
            arr[minimo] = arr[i];
            arr[i] = variable;
        }
        //Se imprime el arreglo ordenado
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
