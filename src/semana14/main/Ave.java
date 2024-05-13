package Semana14.main;
public class Ave extends Animal{
    private String plumaje;
    public Ave (String nombre, int edad, String color, String plumaje){
        super(nombre, edad, color);
        this.plumaje = plumaje;
    }
    public String getPlumaje(){
        return this.plumaje;
    }
    public void setPlumaje(String plumaje){
        this.plumaje = plumaje;
    }
    public void comer() {
        if (getEdad() <= 1) {
            System.out.println("El ave " + getNombre() + " necesita alimento especial para crías.");
        } else {
            System.out.println("El ave " + getNombre() + " está comiendo alimento para adultos.");
        }
        System.out.println("El ave " + getNombre() + " está comiendo.");
    }
    public void dormir(){
        if (getEdad() <= 1) {
            System.out.println("El ave " + getNombre() + " necesita dormir al menos 14 horas al día.");
        } else {
            System.out.println("El ave " + getNombre() + " necesita dormir al menos 8 horas al día.");
        }
        System.out.println("El ave " + getNombre() + " está durmiendo.");
    }
}
