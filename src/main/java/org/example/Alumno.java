package org.example;

import java.util.HashSet;
import lombok.Getter;
import lombok.Setter;

public class Alumno {
    private String nombre;
    private String apellido;
    private HashSet<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, HashSet<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean puedeCursar(Materia materia) {
        return materia.cumpleRequisitos(materiasAprobadas);
    }
}
