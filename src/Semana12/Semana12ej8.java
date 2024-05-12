package Semana12;//Laura Restrepo Berrio
//Fecha: 11/05/2020
//Semana 12 Ejercicio 7
import java.util.Scanner;
import java.util.ArrayList;
public class Semana12ej8 {
    public static int busquedaBinaria(ArrayList<Integer> lista, int valor){
        int inicio = 0;
        int fin = lista.size() - 1;
        while(inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            if(lista.get(medio) == valor){
                return medio;
            }
            if(lista.get(medio) < valor){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        while(true){
            System.out.println("Ingrese un valor o -1 para terminar: ");
            int valor = sc.nextInt();
            if(valor == -1){
                break;
            }
            lista.add(valor);
        }
        System.out.println("Ingrese el valor a buscar: ");
        int valor = sc.nextInt();
        int posicion = busquedaBinaria(lista, valor);
        if(posicion == -1){
            System.out.println("El valor no se encuentra en la lista");
        }else{
            System.out.println("El valor se encuentra en la posicion: " + posicion);
        }
    }
}
