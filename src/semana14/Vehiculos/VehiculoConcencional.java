public class VehiculoConcencional extends Vehiculos {

    private String tipoCombustible;
    private float cilindraje;
    private float kmAutonomia;

    public VehiculoConcencional(String marca, String modelo, String color, float kilometraje, float vMaxima,
            float vActual, String tipoCombustible, float cilindraje, float kmAutonomia) {
        super(marca, modelo, color, kilometraje, vMaxima, vActual);
        this.tipoCombustible = tipoCombustible;
        this.cilindraje = cilindraje;
        this.kmAutonomia = kmAutonomia;
    }

    public void calcularKMTanqueo() {
        float distancia = super.getvActual() / kmAutonomia;
        System.out.println("Deberás volver a tanquear después de recorrer " + distancia + " kilómetros.");
    }

}
