package Semana14.main;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 14 Ejercicio 5
public class main {
    public static void main(String[] args) {
        Ave pajarito = new Ave("Pajaro", 1, "azul", "plumaje corto");
        pajarito.imprimir();
        pajarito.comer();
        pajarito.dormir();

        Animal animal = new Animal("Animal", 1, "azul");
        animal.imprimir();
        animal.comer();
        animal.dormir();

        Mamifero gato = new Mamifero ("Gato", 1, "naraja", "pelaje corto");
        gato.imprimir();
        gato.comer();
        gato.dormir();

    }
}
