package Semana14.figuras;

public class Cuadrado extends figuraGeometrica {
    private double base;
    private double altura;
    public Cuadrado(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return this.base * this.altura;
    }
    public double calcularPerimetro() {
        return (this.altura * 2) + (this.base * 2);
    }
    public void imprimir() {
        System.out.println("El area del cuadrado es: " + calcularArea());
        System.out.println("El perimetro del cuadrado es: " + calcularPerimetro());
    }
}
