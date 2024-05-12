import java.util.Scanner;
public class Sm9Ej6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un string: ");
        String str = sc.nextLine();
        System.out.println(ispar(str));
    }
    private static String ispar(String str) {
        String str1 = "";
        if (str.length() % 2 == 0) {
            str1 = str.charAt(0) + "" + str.charAt(str.length()-1);
        } else {
            str1 = str.substring(0, str.length()/2 +1) +
                    "  " + str.substring(str.length()/2, str.length());
        }
        return str1;
    }
}
