import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long x = n;
        if (n > 0 && n <= 20) {
            for (long i = n-1; i > 0; i--) {
                x = x * i;
            }
            System.out.println(x);
        }
    }
}
