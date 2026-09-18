package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public final class ClaseVirtual {
    private final String nombre;
    private static ClaseVirtual instance;
    private List<Estudiante> listaEstudiantes;

    private ClaseVirtual(String nombre) {
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public static ClaseVirtual getInstance() {
        if (instance == null) {
            instance = new ClaseVirtual("Programacion");
        }
        return instance;
    }


    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    @Override
    public String toString() {
        return "ClaseVirtual{" +
                "nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }

    public void registrarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }
}
