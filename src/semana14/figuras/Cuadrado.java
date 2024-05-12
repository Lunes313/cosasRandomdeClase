package Semana14.figuras;

public class Cuadrado {
    private double base;
    private double altura;

    public Cuadrado() {
        this.base = 2;
        this.altura = 3;
    }

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return this.base * this.altura;
    }

    public double getPerimetro() {
        return (this.altura * 2) + (this.base * 2);
    }

}
