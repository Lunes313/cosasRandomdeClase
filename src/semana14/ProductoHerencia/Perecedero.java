package Semana14.ProductoHerencia;
import java.util.Date;
public class Perecedero extends Producto {
    private Date fechaCaducidad;

    public Perecedero(String nombre, String descripcion, double precio, Date fechaCaducidad) {

        super(nombre, descripcion, precio);
        this.fechaCaducidad = fechaCaducidad;
    }
    public Date getFechaCaducidad(){
        return fechaCaducidad;
    }
    public void setFechaCaducidad(Date fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }
    public double calcularDescuento() {
        if (fechaCaducidad != null) {

            Date hoy = new Date();

            long diferencia = fechaCaducidad.getTime() - hoy.getTime();
            long diasHastaCaducidad = diferencia / (1000 * 60 * 60 * 24);

            if (diasHastaCaducidad <= 7) {
                return getPrecio() * 0.1;
            }
        }
        return 0;

    }
}
