import java.util.Scanner;
public class Sm3Eje10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();
        int x = hora%100;
        if(x <= 59 && hora >= 0 && hora <= 2359){
            if(hora >= 600 && hora <= 1159){
                System.out.println("Buenos días");
            } else if(hora >= 1200 && hora <= 1759){
                System.out.println("Buenas tardes");
            } else if(hora >= 1800 || hora <= 559) {
                System.out.println("Buenas noches");
            }
        } else {
            System.out.println("Hora no válida");
        }

    }
}
