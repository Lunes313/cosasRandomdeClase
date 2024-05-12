import java.util.Scanner;
public class digitos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 999:");
        int num = sc.nextInt();
        do{
            if(num >= 1 && num <= 999){
                System.out.println("Su numero tiene: " + digitos(num) + " dígito(s)");
            }else{
            System.out.println("Su numero debe estar entre 1 y 999: ");
            }
            num = sc.nextInt();
        }while (num != 0);
    }
    private static int digitos(int num) {
        if(num < 10){
            return 1;
        }else if(num < 100){
            return 2;
        }else{
            return 3;
        }
    }
}
