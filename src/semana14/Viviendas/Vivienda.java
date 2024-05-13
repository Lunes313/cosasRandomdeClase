package Semana14.Viviendas;
public class Vivienda {
    private float precio;
    private int numeroHabi;
    private int numeroBaos;
    private String direccion;
    private String estado;
    private float area;

    public Vivienda(float precio, int numeroHabi, int numeroBaos, String direccion, float area) {
        this.precio = precio;
        this.numeroHabi = numeroHabi;
        this.numeroBaos = numeroBaos;
        this.direccion = direccion;
        this.estado = "Disponible";
        this.area = area;
    }

    public void comprarVivienda(float precio) {
        if (precio == this.precio) {
            System.out.println("La vivienda ha sido comprada");
            estado = "Vendida";
        } else if (precio > this.precio) {
            System.out.println("La vivienda ha sido comprada y te sobra: " + (precio - this.precio));
            estado = "Vendida";
        } else {
            System.out.println("La vivienda no ha sido comprada");
        }
    }
    public void informacionVivienda() {
        System.out.println("Precio: " + precio);
        System.out.println("Numero de habitaciones: " + numeroHabi);
        System.out.println("Numero de baños: " + numeroBaos);
        System.out.println("Direccion: " + direccion);
        System.out.println("Estado: " + estado);
        System.out.println("Area: " + area);
    }
    // Getters y Setters
    public float getPrecio() {
        return precio;
    }
    public int getNumeroHabi() {
        return numeroHabi;
    }
    public int getNumeroBaos() {
        return numeroBaos;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEstado() {
        return estado;
    }
    public float getArea() {
        return area;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void setNumeroHabi(int numeroHabi) {
        this.numeroHabi = numeroHabi;
    }
    public void setNumeroBaos(int numeroBaos) {
        this.numeroBaos = numeroBaos;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setArea(float area) {
        this.area = area;
    }
}
