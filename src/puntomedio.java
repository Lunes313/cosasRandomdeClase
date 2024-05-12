import java.util.Scanner;
public class puntomedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las cordenadas de los puntos en el formato 0,0");
        String c = sc.nextLine();
        double f = 0;
        double g = 0;
        int s = 0;
        while (!c.equals("0,0")) {
            double x = Integer.parseInt(c.substring(0, 1));
            double y = Integer.parseInt(c.substring(2));
            f = x+f;
            g = y+g;
            s++;
            c = sc.nextLine();
        }
        System.out.println("El punto medio es: " + (double)(f/s) + ","+ (double)(g/s) );
    }
}
