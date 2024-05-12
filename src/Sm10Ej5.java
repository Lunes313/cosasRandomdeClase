import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Sm10Ej5{
    public static void main(String[] args) {
        System.out.println("Inserte los valores de su Array:" +
                "\n inserte un numero menor o igual que 0 para salir");
        ArrayList<Integer> list = leervalores();
        int n = calcularSuma(list);
        float prom = n/list.size();
        System.out.println("La suma del array es: " + n);
        int min = calcularmenores(prom, list);
        System.out.println("La cantidad de numeros menores que el promedio es: " + min);
        int max = calcularmayores(prom, list);
        System.out.println("La cantidad de numeros mayores o iguales que el promedio es: " + max);
        mostrarmenores(prom, list);
        mostrarmayores(prom, list);

    }

    private static void mostrarmenores(float prom, ArrayList<Integer> list) {
        System.out.println("Los numeros menores son: ");
        for(int i: list){
            if(i<prom){
                System.out.print(i +" ");
            }
        }
    }

    private static void mostrarmayores(float prom, ArrayList<Integer> list) {
        System.out.println("\nLos numeros mayores son: ");
        for(int i: list){
            if(i>=prom){
                System.out.print(i + " ");
            }
        }
    }

    private static int calcularmayores(float prom, ArrayList<Integer> list) {

        int cont = 0;
        for(int i: list){
            if(i>=prom){
                cont++;
            }
        }
        return cont;
    }

    private static int calcularmenores(float prom, ArrayList<Integer> list) {
        int cont = 0;
        for(int i: list){
            if(i<prom){
                cont++;
            }
        }
        return cont;
    }

    private static int calcularSuma(ArrayList <Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while(it.hasNext()){
            sum+=it.next();
        }
        return sum;
    }

    private static ArrayList<Integer> leervalores() {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> nums = new ArrayList<Integer>();
        int x = sc.nextInt();
        while(x>0){
            nums.add(x);
            x = sc.nextInt();
        }
        return nums;
    }
}

