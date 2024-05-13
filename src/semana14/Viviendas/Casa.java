package Semana14.Viviendas;

public class Casa extends Vivienda {
    private int cantidadPisos;
    private boolean patio;
    public Casa(float precio, int numeroHabi, int numeroBaos, String direccion,
                       float area, int cantidadPisos, boolean patio) {
        super(precio, numeroHabi, numeroBaos, direccion, area);
        this.cantidadPisos = cantidadPisos;
        this.patio = patio;
    }
    public void informacionVivienda() {
        System.out.println("Casa");
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Numero de habitaciones: " + this.getNumeroHabi());
        System.out.println("Numero de baños: " + this.getNumeroBaos());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Area: " + this.getArea());
        System.out.println("Cantidad de pisos: " + this.cantidadPisos);
        if (this.patio) {
            System.out.println("Tiene patio");
        } else {
            System.out.println("No tiene patio");
        }
        System.out.println("Estado: " + this.getEstado());
    }
    public int getCantidadPisos() {
        return this.cantidadPisos;
    }
    public boolean getPatio() {
        return this.patio;
    }
    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    public void setPatio(boolean patio) {
        this.patio = patio;
    }
}
