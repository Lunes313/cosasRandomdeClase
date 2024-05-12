import java.util.Scanner;
public class susecion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        if (a < 0 && b < 0 || a > 0 && b < 0){
            for (int i = 0; i < (b*-1); i++) {
                c = c + a;
                System.out.println(-c);
            }
        } else{
            for (int i = 0; i < b; i++) {
                c = c+a;
                System.out.println(c);
            }
        }
    }
}
