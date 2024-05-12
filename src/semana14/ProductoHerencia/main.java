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

        System.out.println("Molde Producto");

        Producto uno = new Producto("Coca-Cola", "Refresco", 15.000);
        uno.imprimir();
        uno.calcularDescuento(10);

        System.out.println("\nProducto Perecedero");
        Perecedero dos = new Perecedero("Papas", "Papas Fritas", 8.000, fechaCaducidad);
        dos.imprimir();
        dos.calcularDescuento(5);

        System.out.println("\nProducto No Perecedero");
        NoPerece tres = new NoPerece("Leche", "Leche entera", 20.000);
        tres.imprimir();
        tres.calcularDescuento(8);
    }
}
