package Semana13.Calculadora;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 13 Ejercicio 1
public class Main {
    public static void main(String[] args) {
        double a = 10.3;
        double b = 5.4;
        double c = 7;
        double d = 6.3;
        double r = 0;
        Calculadora calc = new Calculadora();
        r = calc.sumar(a,b);
        System.out.println(r);
        System.out.println(calc.obtenerMemoria());
        r = calc.restar(c,d);
        System.out.println(r);
        System.out.println(calc.obtenerMemoria());
        calc.iniciarMemoria();
        r = calc.multiplicar(c,d);
        System.out.println(r);
        System.out.println(calc.obtenerMemoria());
        r = calc.dividir(a,b);
        System.out.println(r);
        System.out.println(calc.obtenerMemoria());
    }
}

