import java.util.Scanner;
public class fiibonachi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int c = 0;
        int n = sc.nextInt();
        System.out.println(a + "\n" + b);
        for (int i = 0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
