//Laura Restrepo Berrio
//Fecha: 10/11/2020
//Semana 12 Ejercicio 3
import java.util.ArrayList;
import java.util.Scanner;
public class Semana12ej3 {
    public static void main(String[] args) {
        //Se crea un arreglo de enteros desordenado
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero o -1 para terminar");
        while (true) {
            //leemos un numero entero ingresado por el usuario
            int num = sc.nextInt();
            //si el numero es -1, terminamos el ciclo
            if (num == -1) {
                break;
            }
            //recorremos el arreglo
            for (int i = 0; i < arr.size(); i++) {
                //preguntamos si el numero ingresado es menor al elemento actual en la posicion
                if (num < arr.get(i)) {
                    //si se cumple insertamos el numero en la posicion i y rompemos el ciclo
                    arr.add(i, num);
                    break;
                }
            }
            //si el numero no se inserto lo insertamos al final
            if (!arr.contains(num)) {
                arr.add(num);
            }
            //imprimimos cada iteracion para ver el funcionamiento
            for (int j = 0; j < arr.size(); j++) {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
        }
    }
}
