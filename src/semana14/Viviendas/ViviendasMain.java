import java.util.ArrayList;

public class ViviendasMain {
    public static void main(String[] args) {
        ArrayList<Vivienda> viviendas = new ArrayList<Vivienda>();
        Casa casa1 = new Casa(2000f, 60, 2, 2, "calle 11", "Casa", 2);
        Apartamento apartamento1 = new Apartamento(1900f, 50, 2, 2, "calle 10", "Apartamento", 12);
        Finca finca1 = new Finca(2200f, 50, 2, 2, "calle 9", "Finca", "Si");
        Vivienda vivienda1 = new Vivienda();
        viviendas.add(casa1);
        viviendas.add(apartamento1);
        viviendas.add(finca1);
        for (int i = 0; i < viviendas.size(); i++) {
            if (viviendas.get(i).getEstado().contains("Disponible")) {
                viviendas.get(i).informacionVivienda();
                System.out.print("\n");
            }
        }

        vivienda1.buscarCostosa(viviendas);
        vivienda1.buscarBarata(viviendas);
        casa1.comprarVivienda(2000);

        for (int i = 0; i < viviendas.size(); i++) {
            if (viviendas.get(i).getEstado().contains("Disponible")) {
                viviendas.get(i).informacionVivienda();
                System.out.print("\n");
            } else {
                i = i + 1;
            }

        }
    }
}
