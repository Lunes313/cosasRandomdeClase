package Semana14.main;
public class Animal{
    private String nombre;
    private int edad;
    private String color;
    public Animal(String nombre, int edad, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getColor(){
        return this.color;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void comer(){
        System.out.println("El animal está comiendo");
    }
    public void dormir(){
        System.out.println("El animal está durmiendo");
    }
    public void imprimir(){
        System.out.println("\nEl animal se llama: " + nombre +
                "\nSu edad es: " + edad + "\nSu color es: "+color);
    }
}

