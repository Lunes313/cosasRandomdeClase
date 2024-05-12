import java.util.Scanner;
public class pesca {
    public static boolean chequearPez(double tamaño) {
        boolean pez;
        if (tamaño < 10) {
            pez = false;
        } else{
            pez = true;
        }
        return pez;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del pez");
        double tamaño = sc.nextInt();
        if(chequearPez(tamaño)){
            System.out.println("Puede pescar el pez");
        } else {
            System.out.println("No puede pescar el pez");
        }
    }
}
