package Semana13.Calculadora;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 13 Ejercicio 1
public class Calculadora {

    public double memoria = 0;
    public double obtenerMemoria(){
        return memoria;
    }
    public void iniciarMemoria(){
        memoria = 0;
    }

    public double sumar(double a, double b){
        memoria += a + b;
        return a + b;
    }
    public double restar(double a, double b){
        memoria += a - b;
        return a - b;
    }
    public double multiplicar(double a, double b){
        memoria += a * b;
        return a * b;
    }
    public double dividir(double a, double b){
        memoria += a / b;
        return a / b;
    }
    public void limpiarMemoria(){
        memoria = 0;
    }

}
