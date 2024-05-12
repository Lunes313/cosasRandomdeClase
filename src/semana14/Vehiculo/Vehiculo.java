package Semana14.Vehiculo;

public class Vehiculo{
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private int numPuertas;
    private int numPasajeros;
    public Vehiculo(String marca, String modelo, int año, String color, int numPuertas, int numPasajeros){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.numPuertas = numPuertas;
        this.numPasajeros = numPasajeros;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAño(int año){
        this.año = año;
    }
    public int getAno(){
        return año;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas = numPuertas;
    }
    public int getNumPuertas(){
        return numPuertas;
    }
    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros = numPasajeros;
    }
    public int getNumPasajeros(){
        return numPasajeros;
    }

    public void conducir(){
        System.out.println("Conduciendo...");
    }
    public void frenar(){
        System.out.println("Frenando...");
    }
    public void imprimir(){
        System.out.println("\nMarca: " + marca + "\nModelo: " + modelo +
                "\nAño: " + año + "\nColor: " + color + "\nNúmero de puertas: " +
                numPuertas + "\nNúmero de pasajeros: " + numPasajeros);
    }
}
