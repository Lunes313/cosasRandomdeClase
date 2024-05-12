package Semana14.figuras;

public class main {
    public static void main(String[] args) {

        Circulo Circulo1 = new Circulo(6);
        System.out.println("El area del Ciruclo es: " + Circulo1.getArea());
        System.out.println("El perimetro del Ciruclo es: " + Circulo1.getPerimetro());

        Cuadrado cuadrado1 = new Cuadrado(4, 5);
        System.out.println("El area del Cuadrado es: " + cuadrado1.getArea());
        System.out.println("El perimetro del Cuadrado es: " + cuadrado1.getPerimetro());

    }

}
