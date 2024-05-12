package Semana12;//Laura Restrepo Berrio
//Fecha: 11/05/2020
//Semana 12 Ejercicio 6
import java.util.Scanner;
import java.util.ArrayList;
public class Semana12ej6 {
    //implimentacion del algoritmo de busqueda lineal
    public static int busquedaLineal(ArrayList<Integer> lista, int valor){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) == valor){
                return i;
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
        int posicion = busquedaLineal(lista, valor);
        System.out.println("El valor se encuentra en la posicion: " + posicion);
    }
}
