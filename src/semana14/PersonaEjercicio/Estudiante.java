package Semana14.PersonaEjercicio;

import java.util.ArrayList;

public class Estudiante {
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private int id;
    private int idUniversidad;
    private String email;
    private String carrera;
    private ArrayList<String> listClase;

    public Estudiante(String nombreEstudiante, String apellidoEstudiante, int id, int idUniversidad, String email) {
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.id = id;
        this.idUniversidad = idUniversidad;
        this.email = email;
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
        System.out.println("\nLas clases que toma la estudiante  " + nombreEstudiante + " son: ");
        while (i < this.listClase.size()) {
            System.out.println(this.listClase.get(i) + " " + this.listClase.get(i + 1));
            i = i + 2;
        }
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }
}
