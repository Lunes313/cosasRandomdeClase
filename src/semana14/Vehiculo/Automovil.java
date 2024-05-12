package Semana14.Vehiculo;
public class Automovil extends Vehiculo{
    private String combustible = "";
    public Automovil(String marca, String modelo, int año, String color,
                     int numPuertas, int numPasajeros, String combustible){
        super (marca, modelo,año, color, numPuertas, numPasajeros);
        this.combustible = combustible;
    }
    public void setCombustible(String combustible){
        this.combustible = combustible;
    }
    public String getCombustible(){
        return combustible;
    }
    public void conducir(double distancia){
        System.out.println("Conduciendo automovil...");
        double consumoCombustible = distancia * 10; // Supongamos un consumo de 10 litros por kilómetro;
        System.out.println("Distancia recorrida: " + distancia + " km");
        System.out.println("Consumo de combustible: " + consumoCombustible + " litros");
    }
    public void frenar(int velocidad) {
        double distanciaFrenado = (velocidad * velocidad) / 180.0;

        System.out.println("Frenando el vehículo...");
        System.out.println("Velocidad actual: " + velocidad + " km/h");
        System.out.println("Distancia de frenado: " + distanciaFrenado + "metros");
    }
}
