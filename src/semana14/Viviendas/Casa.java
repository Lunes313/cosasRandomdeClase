
public class Casa extends Vivienda {
    private int cantidadPisos;

    public Casa(float precio, int m, int nHabitaciones, int nBanos, String direccion, String tipo, int cantidadPisos) {
        super(precio, m, nHabitaciones, nBanos, direccion, tipo);
        this.cantidadPisos = cantidadPisos;
    }

    public void informacionVivienda() {
        System.out.println("El tipo de la vivienda es: " + super.getTipo());
        System.out.println("El precio de la vivienda es: " + super.getPrecio());
        System.out.println("La superficie de la vivienda es: " + super.getSuperficie());
        System.out.println("La casa tiene una cantidad de " + cantidadPisos + "pisos");
        System.out.println("El numero de habitaciones es: " + super.getnHabitaciones());
        System.out.println("El numero de baños es: " + super.getnBanos());
        System.out.println("La direccion de la vivienda es: " + super.getDireccion());
        System.out.println("La vivienda esta: " + super.getEstado());
    }

    public int getCantidadPisos() {
        return this.cantidadPisos;
    }
}
