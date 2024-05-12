public class Vehiculos {

    private String marca;
    private String modelo;
    private String color;
    private float kilometraje;
    private float vMaxima;
    private float vActual;

    public Vehiculos(String marca, String modelo, String color, float kilometraje, float vMaxima, float vActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.vMaxima = vMaxima;
        this.vActual = vActual;
    }

    public void acelerar() {
        if (vActual <= vMaxima + 5) {
            vActual = vActual + 5;
            System.out.println("En un tiempo de: " + calculadoraKm()
                    + "s llegara a su destino con su velocidad actual de: " + vActual + "m/s");
        } else {
            System.out.println("La velocidad máxima ha sido alcanzada o esta proxima a ser alcanzada");
        }
    }

    public void desacelerar() {
        if (vActual >= 5) {
            vActual = vActual - 5;
            System.out.println("En un tiempo de: " + calculadoraKm()
                    + "s llegara a su destino con su velocidad actual de: " + vActual + "m/s");
        } else {
            System.out.println("La velocidad minima ha sido alcanzada o esta proxima a ser alcanzada");
        }
    }

    public void frenar() {
        System.out.println("Acabas de Frenar, el vehiculo se detuvo");
        vActual = 0;
    }

    public float calculadoraKm() {
        return kilometraje / vActual;
    }

    public float getvActual() {
        return vActual;
    }
}
