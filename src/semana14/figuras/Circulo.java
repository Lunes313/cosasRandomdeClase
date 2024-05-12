package Semana14.figuras;

public class Circulo {
    private double r;

    public Circulo() {
        this.r = 1;
    }

    public Circulo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getArea() {
        return (this.r * this.r + 3.1416);
    }

    public double getPerimetro() {
        return (2 * this.r * 3.1416);
    }

}
