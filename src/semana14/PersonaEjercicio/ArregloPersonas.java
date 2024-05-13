package Semana14.PersonaEjercicio;

import java.util.ArrayList;
public class ArregloPersonas {
    private ArrayList<Persona> personas;
    public ArregloPersonas() {
        personas = new ArrayList<Persona>();
    }
    public void adicionar(Persona p) {
        if(personas.size() < 10) {
            personas.add(p);
        }
    }
    public Persona buscarPorIdentificacion(int id) {
        for(Persona p : personas) {
            if(p.getDocumento() == id) {
                return p;
            }
        }
        return null;
    }
    public ArrayList<Persona> buscarPorAnio(int anio) {
        ArrayList<Persona> personasAnio = new ArrayList<Persona>();
        for(Persona p : personas) {
            if(p.getAñoNacimiento() == anio) {
                personasAnio.add(p);
            }
        }
        return personasAnio;
    }
    public void imprimir() {
        for(Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre() + " " + p.getApellido());
        }
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
}
