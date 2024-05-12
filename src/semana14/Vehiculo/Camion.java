package Semana14.Vehiculo;

public class Camion extends Vehiculo{
    private double capacidadCarga;

    public Camion(String marca, String modelo, int año, String color,
                  int numPuertas, int numPasajeros, double capacidadCarga){
        super(marca, modelo, año, color, numPuertas, numPasajeros);
        this.capacidadCarga = capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }
    public double getCapacidadCarga(){
        return capacidadCarga;
    }
    public void cargar(double pesoCarga){
        System.out.println("Cargando camión...");
        double cargaRestante = capacidadCarga - pesoCarga;
        System.out.println("Peso de la carga restante (no usado): " + cargaRestante + " kg");
    }
    public void conducir(double distancia){
        System.out.println("Conduciendo camión...");
        double consumoCombustible = distancia * 10; // Supongamos un consumo de 10 litros por kilómetro;
        System.out.println("Distancia recorrida: " + distancia + " km");
        System.out.println("Consumo de combustible: " + consumoCombustible + " litros");

    }
    public void frenar(int velocidad) {
        double distanciaFrenado = (velocidad * velocidad) / 180.0;

        System.out.println("Frenando el camión...");
        System.out.println("Velocidad actual: " + velocidad + " km/h");
        System.out.println("Distancia de frenado: " + distanciaFrenado + " metros");
    }
}
