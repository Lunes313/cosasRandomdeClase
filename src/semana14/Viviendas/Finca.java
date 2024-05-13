package Semana14.Viviendas;

public class Finca extends Vivienda {
    private String animales;
    private int hecTerreno;

    public Finca(float precio, int numeroHabi, int numeroBaos, String direccion, float area, String animales, int hecTerreno) {
        super(precio, numeroHabi, numeroBaos, direccion, area);
        this.animales = animales;
        this.hecTerreno = hecTerreno;
    }
    public void informacionVivienda() {
        System.out.println("Finca: ");
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Numero de habitaciones: " + this.getNumeroHabi());
        System.out.println("Numero de baños: " + this.getNumeroBaos());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Area: " + this.getArea());
        System.out.println("Animales: " + this.animales);
        System.out.println("Hectareas de terreno: " + this.hecTerreno);
        System.out.println("Estado: " + this.getEstado());
    }

    // Getters y Setters

    public void setAnimales(String animales) {
        this.animales = animales;
    }

    public void setHecTerreno(int hecTerreno) {
        this.hecTerreno = hecTerreno;
    }

    public String getAnimales() {
        return animales;
    }

    public int getHecTerreno() {
        return hecTerreno;
    }

}
