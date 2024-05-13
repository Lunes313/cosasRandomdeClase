package Semana14.ProductoHerencia;

import java.util.Date;
import java.util.Calendar;
public class main {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaActual);

        calendar.add(Calendar.DAY_OF_MONTH, 6);

        Date fechaCaducidad = calendar.getTime();

        System.out.println("Producto Perecedero");
        Perecedero producto1 = new Perecedero("Manzana", "Manzana Roja",
                5.000, fechaCaducidad);
        producto1.imprimir();
        producto1.calcularDescuento(10);

        System.out.println("Producto No Perecedero");
        NoPerece producto2 = new NoPerece("atun", "Atun enlatado", 5.600);
        producto2.imprimir();
        producto2.calcularDescuento(8);

    }
}
