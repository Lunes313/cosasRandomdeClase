package Semana14.Universidad;

import java.util.ArrayList;

public class Clase {
    private String codigoMateria;
    private String nombreMateria;
    private String fechaInicio;
    private String fechaFinal;
    private String dia;
    private int horasTotales;
    private int horasSemanales;
    private Profesor profesor;
    private ArrayList<Estudiante> alumnos;
    private int numeroAlumnos;

    public Clase(String codigoMateria, String nombreMateria, String fechaInicio, String fechaFinal, String dia,
            int horasTotales, int horasSemanales, Profesor profesor) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.dia = dia;
        this.horasTotales = horasTotales;
        this.horasSemanales = horasSemanales;
        this.profesor = profesor;
        this.alumnos = new ArrayList<Estudiante>();
    }

    public void agregarAlumnos(Estudiante estudiante) {
        if (alumnos.size() < 30) {
            alumnos.add(estudiante);
        } else {
            System.out.print("\nLa clase no tiene más cupos disponibles");
        }
        this.setNumeroAlumnos(alumnos.size());
    }

    public void listaAlumnos() {
        System.out.println("\nLista de alumnos de la clase "  +nombreMateria);
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i).getNombreEstudiante() + " " + alumnos.get(i).getApellidoEstudiante());
        }
    }

    public void imprimirInformacion() {
        System.out.println("\nInformacion de la materia");
        System.out.println("Nombre: " + nombreMateria);
        System.out.println("Codigo: " + codigoMateria);
        System.out
                .println("Profesor: " + this.profesor.getNombreProfesor() + " " + this.profesor.getApellidoProfesor());
        System.out.println("Horas totales: " + horasTotales);
        System.out.println("Horas semanales: " + horasSemanales);
        System.out.println("Fecha inicio: " + fechaInicio);
        System.out.println("Fecha final: " + fechaFinal);
        System.out.println("Dia: " + dia);
        System.out.println("Numero de alumnos: " + this.numeroAlumnos);
    }

    public String getNombreClase() {
        return this.nombreMateria;
    }

    public String getCodigoClase() {
        return this.codigoMateria;
    }

    public void setNumeroAlumnos(int nAlumnos) {
        this.numeroAlumnos = nAlumnos;
    }
}