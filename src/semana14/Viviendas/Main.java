package Semana14.Viviendas;
import java.util.ArrayList;
//Laura Restrepo Berrio
//Fecha: 12/05/2024
//Semana 14 Class Vivienda
public class Main {
    public static void main(String[] args) {
        ArrayList<Vivienda> viviendas = new ArrayList<Vivienda>();
        Casa casa = new Casa(120, 100, 3, "Calle 1", 100, 2, true );
        Apartamento apartamento = new Apartamento(80, 70, 2, "Calle 2", 30, 3, "Carlos", 3);
        Finca finca = new Finca(1000, 800, 4, "Calle 3", 500, "Si", 100);
        Casa casa2 = new Casa(150, 120, 4, "Calle 4", 150, 3, false);
        Apartamento apartamento2 = new Apartamento(100, 90, 3, "Calle 5", 40, 2, "Maria", 2);
        Finca finca2 = new Finca(2000, 1500, 6, "Calle 6", 800, "No", 200);
        viviendas.add(casa);
        viviendas.add(apartamento);
        viviendas.add(finca);
        viviendas.add(casa2);
        viviendas.add(apartamento2);
        viviendas.add(finca2);
        for (Vivienda v : viviendas) {
            v.informacionVivienda();
        }
        System.out.println();
        buscarBarata(viviendas);
        buscarCostosa(viviendas);
    }
    public static void buscarBarata(ArrayList<Vivienda> viviendas) {
        int menor = 0;
        float preciom = viviendas.get(0).getPrecio();
        for (int i = 1; i < viviendas.size(); i++) {
            if (viviendas.get(i).getPrecio() < preciom) {
                menor = i;
                preciom = viviendas.get(menor).getPrecio();
            }
        }
        System.out.println("La vivienda más barata es: ");
        viviendas.get(menor).informacionVivienda();
        System.out.println();
    }
    public static void buscarCostosa(ArrayList<Vivienda> viviendas) {
        int mayor = 0;
        float precioM = 0;
        for (int i = 0; i < viviendas.size(); i++) {
            if (viviendas.get(i).getPrecio() > precioM) {
                mayor = i;
                precioM = viviendas.get(mayor).getPrecio();
            }
        }
        System.out.println("La vivienda más costosa es: ");
        viviendas.get(mayor).informacionVivienda();
        System.out.println();
    }
}
