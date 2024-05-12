package Semana14.ProductoHerencia;

public class Producto{
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto(String nombre, String descripcion, double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecio(){
        return precio;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void calcularDescuento( double descuento){
        descuento = precio * (descuento/100);
        precio = precio - descuento;
        System.out.println("El precio final con descuento es: " + precio);
    }
    public void imprimir(){
        System.out.println("\nNombre: " + nombre + "\nDescripcion: " + descripcion + "\nPrecio: "+precio);
}}
