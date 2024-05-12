package Semana10;

import java.util.ArrayList;
import java.util.Iterator;
public class Sm10Ej1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Juan");
        list.add("Pedro");
        list.add("Luis");
        list.add("Ana");
        list.add("Maria");
        list.add("Laura");
        list.add("Carlos");

        Iterator<String> iterator = list.iterator();
        System.out.println("Nombres:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
