package Semana14.Vehiculos;

public class VehiculoMain {

    public static void main(String[] arg) {
        VehiculoConcencional rayo = new VehiculoConcencional("Toyota", "Hilux097", "Rojo", 10000f, 200f, 0f, "Disel",
                20, 100);
        rayo.acelerar();
        rayo.acelerar();
        rayo.calcularKMTanqueo();
        VehiculoHibrido rayido = new VehiculoHibrido("Toyotita", "AMC", "White", 400f, 25f, 15f, "Disel", 300f, 20f, 4,
                100, 2, 34);
        rayido.acelerar();
        rayido.acelerar();
        rayido.acelerar();
        rayido.frenar();
        if (rayido.gettipoCombustible().contains("Disel")) {
            rayido.calcularKMTanqueo();
        } else {
            rayido.calculadoraKMCarga();
        }

        VehiculoElectrico rayote = new VehiculoElectrico("Toyoto", "KMNH", "Pink", 500f, 300f, 295f, 5, 20, 5, 60);
        rayote.desacelerar();
        rayote.calculadoraKMCarga();
    }
}
