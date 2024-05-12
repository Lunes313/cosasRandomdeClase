import java.util.Scanner;
public class MasAlto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a > b && a > c) {
            System.out.println("El mas alto es a que mide:" + a);
        } else if (b > a && b > c) {
            System.out.println("El mas alto es b que mide: " + b);
        } else if (c > a && c > b){
            System.out.println("El mas alto  es c que mide: " + c);
        } else if (a == b && a == c){
            System.out.println("Los números son iguales");
        } else if (a == b){
            System.out.println("a y b son iguales");
        } else if (a == c){
            System.out.println("a y c son iguales");
        } else if (b == c){
            System.out.println("b y c son iguales");
        }

    }
}
