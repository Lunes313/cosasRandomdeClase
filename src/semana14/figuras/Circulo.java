package Semana14.figuras;

public class Circulo extends figuraGeometrica {
    private double r;
    public Circulo(double r, String color) {
        super(color);
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public double calcularArea() {
        return (this.r * this.r + 3.1416);
    }
    public double calcularPerimetro() {
        return (2 * this.r * 3.1416);
    }
    public void imprimir() {
        System.out.println("El radio del circulo es: " + this.r);
        System.out.println("El area del circulo es: " + calcularArea());
        System.out.println("El perimetro del circulo es: " + calcularPerimetro());
    }
}
