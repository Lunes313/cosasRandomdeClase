package Semana14.PersonaEjercicio;

public class Universidad {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("David", "Tamayo", 1091, 1901, "@", "Ciencias");
        Profesor profesor2 = new Profesor("Mario", "Tamayo", 1291, 1921, "@", "Matematicas");
        Clase ciencias = new Clase("2963", "Ciencias", "27/09/2000", "34/83/2000", "Martes", 20, 90, profesor1);
        Clase matematicas = new Clase("8963", "Matematicas", "27/09/2000", "34/83/2000", "Martes", 20, 90, profesor2);
        Estudiante maria = new Estudiante("Maria", "Alzate", 1097, 7901, "@");
        Estudiante mario = new Estudiante("Mario", "Alzate", 1037, 2901, "@");
        Estudiante mari = new Estudiante("Marii", "Alzate", 1057, 2501, "@");
        profesor1.agregarClase(ciencias);
        profesor1.imprimirMaterias();
        profesor2.agregarClase(matematicas);
        profesor2.imprimirMaterias();

        matematicas.agregarAlumnos(maria);
        matematicas.agregarAlumnos(mari);
        matematicas.listaAlumnos();
        matematicas.imprimirInformacion();

        ciencias.agregarAlumnos(maria);
        ciencias.agregarAlumnos(mario);
        ciencias.listaAlumnos();
        ciencias.imprimirInformacion();

        maria.agregarClase(ciencias);
        maria.imprimirMaterias();

        mario.agregarClase(matematicas);
        mario.agregarClase(ciencias);
        mario.imprimirMaterias();

        mari.agregarClase(matematicas);
        mari.imprimirMaterias();
    }
}
