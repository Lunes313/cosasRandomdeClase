import java.util.Scanner;
public class condicional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese si la persona respira como true o false:");
        boolean respira = sc.nextBoolean();
        if (respira == true){
            System.out.println("La persona respira, Ingrese el pulso de la persona:");
            int pulso = sc.nextInt();
            if (pulso > 30) {
                System.out.println("llaame a emergencias");
            }else{
                    System.out.println("llame a emergencias");
                }
        }else {
            System.out.println("Poner en posicion adecuanda para respirar");
            System.out.println("respira?");
            respira = sc.nextBoolean();
            if (respira == true){
                System.out.println("todavia respira, llame a emergencias");
            }else {
                System.out.println("ya no respira, se murio");
            }
        }
    }
}
