package Semana14.Viviendas;

public class Apartamento extends Vivienda {
    private int numeroPiso;
    private String nombreEdificio;
    private int numApartamento;
    public Apartamento(float precio, int numeroHabi, int numeroBaos, String direccion,
                       float area, int numPiso, String nombreEdificio, int numApartamento) {
        super(precio, numeroHabi, numeroBaos, direccion, area);
        this.numeroPiso = numPiso;
        this.nombreEdificio = nombreEdificio;
        this.numApartamento = numApartamento;
    }
    public void informacionVivienda() {
        System.out.println("Apartamento");
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Numero de habitaciones: " + this.getNumeroHabi());
        System.out.println("Numero de baños: " + this.getNumeroBaos());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Area: " + this.getArea());
        System.out.println("Numero de piso: " + this.numeroPiso);
        System.out.println("Nombre del edificio: " + this.nombreEdificio);
        System.out.println("Numero de apartamento: " + this.numApartamento);
        System.out.println("Estado: " + this.getEstado());
    }

    // Getters y Setters
    public int getNumeroPiso() {
        return numeroPiso;
    }
    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
    public String getNombreEdificio() {
        return nombreEdificio;
    }
    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }
    public int getNumApartamento() {
        return numApartamento;
    }
    public void setNumApartamento(int numApartamento) {
        this.numApartamento = numApartamento;
    }
}
