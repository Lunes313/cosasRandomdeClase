import java.util.Scanner;
public class mes {
    public static String Nombre(int num) {
        String mes = "";
        if(num == 1) {
            mes = "Enero";
        } else if(num == 2) {
            mes = "Febrero";
        } else if(num == 3) {
            mes = "Marzo";
        } else if(num == 4) {
            mes = "Abril";
        } else if(num == 5) {
            mes = "Mayo";
        } else if(num == 6) {
            mes = "Junio";
        } else if(num == 7) {
            mes = "Julio";
        } else if(num == 8) {
            mes = "Agosto";
        } else if(num == 9) {
            mes = "Septiembre";
        } else if(num == 10) {
            mes = "Octubre";
        } else if(num == 11) {
            mes = "Noviembre";
        } else if(num == 12) {
            mes = "Diciembre";
        }
        return mes;
    }
    public static int Dias(int numeroMes, int año) {
        int dias = 0;
        if (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 7
                || numeroMes == 8 || numeroMes == 10 || numeroMes == 12) {
            dias = 31;
        }else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
            dias = 30;
        }else if (numeroMes == 2) {
            if (esBisiesto(año)) {
                dias = 29;
            } else {
                dias = 28;
            }
        }
        return dias;
    }
    public static boolean esBisiesto(int año) {
        boolean b = false;
        if((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            b = true;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número del mes (1-12):");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año (4 dígitos):");
        int anio = scanner.nextInt();
        System.out.println("El mes es " + Nombre(mes) + " y tiene " + Dias(mes, anio) + " días.");
    }
}

