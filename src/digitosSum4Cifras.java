import java.util.Scanner;
public class digitosSum4Cifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Suma de digitos d eun entero");
        int num1;
        System.out.println("Ingrese un entero de no mas de 5 digitos : ");
        num1 = scanner.nextInt();
        System.out.println((num1/10000)+((num1%10000)/1000)+((num1%1000)/100)+((num1%100)/10)+(num1%10));
    }

}
