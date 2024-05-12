import java.util.Scanner;
public class sumprimos {
    public static int sumarPrimos(int m, int n){
            int x = 0;
            for(int i=m;i<=n;i++){
                if(isprimo(i)){
                    x = x+i;
                }
            }
            return x;
    }

    private static boolean isprimo(int i) {
        int cont = 0;
        boolean r = false;
        for(int j = 1; j<i;j++){
            if(i%j==0){
                cont +=1;
            }
            if(cont>1){
                r = false;
                break;
            }else{
                r = true;
            }
        }
        return r;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese dos números de menor a mayor: ");
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m>n){
                System.out.println("El primer número debe ser menor o igual al segundo");
            }else{
            System.out.println("La suma de los primos es: " + sumarPrimos(m,n));
            }
    }
}
