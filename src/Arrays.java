import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
           array[i] = sc.nextInt();
         }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
