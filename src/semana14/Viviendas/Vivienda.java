import java.util.ArrayList;

public class Vivienda {
    private float precio;
    private int m;
    private int nHabitaciones;
    private int nBanos;
    private String direccion;
    private String tipo;
    private String estado;

    public Vivienda(float precio, int m, int nHabitaciones, int nBaños, String direccion, String tipo) {
        this.precio = precio;
        this.m = m;
        this.nHabitaciones = nHabitaciones;
        this.nBanos = nBaños;
        this.direccion = direccion;
        this.tipo = tipo;
        this.estado = "Disponible";
    }

    public Vivienda() {

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

    public void buscarCostosa(ArrayList<Vivienda> viviendas) {
        int mayor = 0;
        float precioM = 0;
        for (int i = 0; i < viviendas.size(); i++) {
            if (viviendas.get(i).getPrecio() > precioM) {
                mayor = i;
                precioM = viviendas.get(mayor).getPrecio();
            }

        }
        System.out.println("La vivienda más costosa es: ");
        viviendas.get(mayor).informacionVivienda();
        System.out.println();

    }

    public void buscarBarata(ArrayList<Vivienda> viviendas) {
        int menor = 0;
        float preciom = viviendas.get(0).getPrecio();
        for (int i = 1; i < viviendas.size(); i++) {
            if (viviendas.get(i).getPrecio() < preciom) {
                menor = i;
                preciom = viviendas.get(menor).getPrecio();
            }

        }
        System.out.println("La vivienda más barata es: ");
        viviendas.get(menor).informacionVivienda();
        System.out.println();
    }

    public void informacionVivienda() {

    }

    public float getPrecio() {
        return this.precio;
    }

    public float getSuperficie() {
        return this.m;
    }

    public float getnHabitaciones() {
        return this.nHabitaciones;
    }

    public float getnBanos() {
        return this.nBanos;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getTipo() {
        return this.tipo;
    }

}
