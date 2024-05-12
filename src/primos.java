import java.util.Scanner;
public class primos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 0;
        if (n > 0) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    div++;
                }
            }
            if (div == 0) {
                System.out.println(n + " es primo");
            } else {
                System.out.println(n + "no es primo");
            }
        }
    }
}
