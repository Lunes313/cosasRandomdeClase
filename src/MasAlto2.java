import java.util.Scanner;
public class MasAlto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a > b) {
            if (a > c) {
                if(b>c){
                    System.out.println(a + b + c);
                }else if (c > b){
                    System.out.println(a + c + b);
                } else{
                    System.out.println(a + b + c + "b y c son iguales");
                }
            } else if (a == c){
                System.out.println(c + b + a + "b y c son iguales");
            }
        } else if (b > c){
            System.out.println("El mas alto es b que mide: " + b);
        } else if (b == c){
            System.out.println("b y c son iguales");
        } else {
            System.out.println("El mas alto  es c que mide: " + c);

        }
    }
}
