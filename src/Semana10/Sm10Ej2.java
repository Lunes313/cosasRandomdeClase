package Semana10;

import java.util.ArrayList;
public class Sm10Ej2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Juan");
        list.add("Pedro");
        list.add("Luis");
        list.add("Ana");
        list.add("Maria");
        list.add("Laura");
        list.add("Carlos");
        System.out.println("Nombres:");
        for(String s : list) {
            System.out.println(s);
        }
    }
}