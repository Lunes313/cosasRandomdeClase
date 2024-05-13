package Semana14.main;

public class Mamifero extends Animal{
    private String pelaje;

    public Mamifero (String nombre, int edad, String color, String pelaje){
        super(nombre, edad, color);
        this.pelaje = pelaje;
    }
    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje){
        this.pelaje = pelaje;
    }
    public void comer(){
        if (getEdad() <= 1) {
            System.out.println("El mamífero " + getNombre() + " necesita leche materna.");
        } else {
            System.out.println("El mamífero " + getNombre() + " necesita comer carne y/o vegetales.");
        }
        System.out.println("El mamífero " + getNombre() + " está comiendo.");
    }
    public void dormir() {
        if (getEdad() <= 1) {
            System.out.println("El mamífero " + getNombre() + " necesita dormir al menos 16 horas al día.");
        } else {
            System.out.println("El mamífero " + getNombre() + " necesita dormir al menos 8 horas al día.");
        }
        System.out.println("El mamífero " + getNombre() + " está durmiendo.");
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Su pelaje es: " +pelaje);
    }
}
