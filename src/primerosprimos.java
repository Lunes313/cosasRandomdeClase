import java.util.Scanner;
public class primerosprimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        int c = 0;
        while (c < n) {
            int p = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    p = 1;
                    break;
                }
            }
            if (p == 0) {
                System.out.println(i);
                c++;
            }
            i++;
        }
    }
}




