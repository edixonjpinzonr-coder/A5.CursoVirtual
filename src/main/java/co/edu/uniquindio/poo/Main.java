package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.ClaseVirtual;
import co.edu.uniquindio.poo.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        ClaseVirtual claseVirtual = ClaseVirtual.getInstance();
        Estudiante estudiante1 = new Estudiante.Builder()
                .nombre("Juan Pérez")
                .correo("juan@correo.com")
                .telefono("3001234567")
                .direccion("Calle 10 #15-20")
                .intereses("Programación, Inteligencia Artificial")
                .build();

        Estudiante estudiante2 = new Estudiante.Builder()
                .nombre("Ana Gómez")
                .correo("ana@correo.com")
                .build();

        claseVirtual.registrarEstudiante(estudiante1);
        claseVirtual.registrarEstudiante(estudiante2);

        System.out.println("Clase Virtual");
        System.out.println("Nombre:" + claseVirtual.getNombre());
        System.out.println("\nEstudiantes registrados:");
        for (Estudiante est : claseVirtual.getListaEstudiantes()) {
            System.out.println(est);
        }
    }
}