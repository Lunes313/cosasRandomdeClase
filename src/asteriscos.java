import java.util.Scanner;
public class asteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = "*";
        if(n > 0 && n <= 20) {
            for (int i = 0; i < n; i++) {
                System.out.println(x);
                x = x + "*";
            }
        }
    }
}

