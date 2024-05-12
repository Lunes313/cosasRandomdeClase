package Semana14.figuras;
public class figuraGeometrica {
    private double area;
    private double perimetro;
    private String color;
    public figuraGeometrica(String color) {
        this.color = color;
        this.area = 0;
        this.perimetro = 0;
    }
    public double calcularArea() {
        System.out.println("El area es: " + area);
        return 0;
    }
    public double calcularPerimetro() {
        System.out.println("El perimetro es: " + perimetro);
        return 0;
    }
    public void imprimir(double area) {
        System.out.println("tu figura tiene un area de: " + area + " y un perimetro de: "
                + perimetro + " y es de color: " + color);
    }
}
