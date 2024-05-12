import java.util.Scanner;
public class sumadeprimos {

    private static int sumarPrimos(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Ingrese dos números de menor a mayor: ");
        m = sc.nextInt();
        n = sc.nextInt();

        System.out.println("La suma de los primos es: " + sumarPrimos(m,n));
    }

}
