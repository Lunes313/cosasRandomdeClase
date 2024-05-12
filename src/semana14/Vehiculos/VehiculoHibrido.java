public class VehiculoHibrido extends Vehiculos {
    private String tipoCombustible;
    private float cilindraje;
    private int numeroBaterias;
    private float duracionBateria;
    private float tiempoCarga;
    private float kmAutonomiaCarga;
    private float kmAutonomia;

    public VehiculoHibrido(String marca, String modelo, String color, float kilometraje, float vMaxima,
            float vActual, String tipoCombustible, float cilindraje, float kmAutonomia, int numeroBaterias,
            float duracionBateria, float tiempoCarga, float kmAutonomiaCarga) {
        super(marca, modelo, color, kilometraje, vMaxima, vActual);
        this.tipoCombustible = tipoCombustible;
        this.cilindraje = cilindraje;
        this.kmAutonomia = kmAutonomia;
        this.numeroBaterias = numeroBaterias;
        this.duracionBateria = duracionBateria;
        this.tiempoCarga = tiempoCarga;
        this.kmAutonomiaCarga = kmAutonomia;
    }

    public void calcularKMTanqueo() {
        float distancia = super.getvActual() / kmAutonomia;
        System.out.println("Deberás volver a tanquear después de recorrer " + distancia + " kilómetros.");
    }

    public void calculadoraKMCarga() {
        float distancia = (super.getvActual() / kmAutonomiaCarga) * numeroBaterias;
        System.out.println("Deberás volver a tanquear después de recorrer " + distancia + " kilómetros.");
    }

    public String gettipoCombustible() {
        return tipoCombustible;
    }
}
