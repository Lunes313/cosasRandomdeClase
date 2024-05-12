package Semana14.Vehiculo;
//Laura Restrepo Berrio
//Fecha: 12/05/2020
//Semana 14 Ejercicio 3
public class main {
    public static void main(String[] args) {

        Automovil carro = new Automovil("Chevrolet", "Spark", 2021,
                "Rojo", 4, 4, "1000");
        carro.imprimir();
        carro.conducir(100);
        carro.frenar(10);

        Camion cami = new Camion("Chevrolet", "NHR", 2021,
                    "Blanco", 2, 2, 5000);
        cami.imprimir();
        cami.cargar(1000);
        cami.conducir(100);
        cami.frenar(10);
    }
}

