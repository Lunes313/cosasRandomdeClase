import java.util.Scanner;
public class Sm3Eje8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        if(mes > 0 && mes < 13){
            System.out.print("Ingrese la cantidad de inversion: ");
            int pesos = scanner.nextInt();
            if(pesos%100000==0 && pesos < 20000000){
                System.out.print("Ingrese el valor del dólar al iniciar: ");
                int dolar = scanner.nextInt();
                if(mes<=3){
                    System.out.println("Usted obtuvo " + String.format("%.3f",(double)(pesos/dolar)) + " dólares");
                } else if (mes<=6){
                        System.out.println("Usted obtuvo " + String.format("%.3f",(double)(pesos/(dolar*0.95))) + " dólares");
                } else if (mes>9){
                            System.out.println("Usted obtuvo " + String.format("%.3f",(double)(pesos/((dolar*0.95)*1.1))) + " dólares");
                }
            }else{
                System.out.println("Error en la cantidad a invertir");
            }
        }else {
            System.out.println("Error en el mes");
        }
    }
}
