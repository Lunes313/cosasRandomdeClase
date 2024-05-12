package Semana13.CalculoAyP;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 13 Ejercicio 2
public class Rectangulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.perimetro = base * altura;
        this.area = 2 * base + 2 * altura;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
}
