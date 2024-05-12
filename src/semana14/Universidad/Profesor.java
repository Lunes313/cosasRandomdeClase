package Semana14.Universidad;

import Semana14.Universidad.Clase;

import java.util.ArrayList;

public class Profesor {

    private String nombreProfesor;
    private String apellidoProfesor;
    private int id;
    private int idUniversidadP;
    private String email;
    private String clase;
    private ArrayList<String> listClase;

    public Profesor(String nombreProfesor, String apellidoProfesor, int id, int idUniversidadP, String email,
            String clase) {
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.id = id;
        this.idUniversidadP = idUniversidadP;
        this.email = email;
        this.clase = clase;
        this.listClase = new ArrayList<String>();
    }

    public void agregarClase(Clase clase) {
        if (this.listClase.contains(clase.getNombreClase())) {
            System.out.println("La clase ya existe");

        } else {
            this.listClase.add(clase.getNombreClase());
            this.listClase.add(clase.getCodigoClase());
        }
    }

    public void imprimirMaterias() {
        int i = 0;
        System.out.println("\nMaterias que imparte el profesor " + this.nombreProfesor + " "
                + this.apellidoProfesor + " son: ");
        while (i < this.listClase.size()) {
            System.out.println(this.listClase.get(i) + " " + this.listClase.get(i + 1));
            i = i + 2;
        }
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }
}
