package Semana14.ProductoHerencia;
public class NoPerece extends Producto {

    public NoPerece(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }
    public void calcularDescuento(double descuento) {
        double descuentoAplicado = getPrecio() * (descuento / 100);
        double precioFinal = getPrecio() - descuentoAplicado;
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
