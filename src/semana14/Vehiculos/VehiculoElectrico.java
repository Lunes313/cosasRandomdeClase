package Semana14.Vehiculos;

public class VehiculoElectrico extends Vehiculos {
    private int numeroBaterias;
    private float duracionBateria;
    private float tiempoCarga;
    private float kmAutonomiaCarga;

    public VehiculoElectrico(String marca, String modelo, String color, float kilometraje, float vMaxima, float vActual,
            int numeroBaterias, float duracionBateria, float tiempoCarga, float kmAutonomiaCarga) {
        super(marca, modelo, color, kilometraje, vMaxima, vActual);
        this.numeroBaterias = numeroBaterias;
        this.duracionBateria = duracionBateria;
        this.tiempoCarga = tiempoCarga;
        this.kmAutonomiaCarga = kmAutonomiaCarga;
    }

    public void calculadoraKMCarga() {
        float distancia = super.getvActual() / kmAutonomiaCarga;
        System.out.println("Deberás volver a tanquear después de recorrer " + distancia + " kilómetros.");
    }

}
