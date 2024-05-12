public class Finca extends Vivienda {
    private String animales;

    public Finca(float precio, int m, int nHabitaciones, int nBanos, String direccion, String tipo, String animales) {
        super(precio, m, nHabitaciones, nBanos, direccion, tipo);
        this.animales = animales;
    }

    public void informacionVivienda() {
        System.out.println("El tipo de la vivienda es: " + super.getTipo());
        System.out.println("El precio de la vivienda es: " + super.getPrecio());
        System.out.println("La superficie de la vivienda es: " + super.getSuperficie());
        System.out.println("La finca posee animales: " + animales);
        System.out.println("El numero de habitaciones es: " + super.getnHabitaciones());
        System.out.println("El numero de baños es: " + super.getnBanos());
        System.out.println("La direccion de la vivienda es: " + super.getDireccion());
        System.out.println("La vivienda esta: " + super.getEstado());
    }
}
