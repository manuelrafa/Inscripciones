package org.example;

import java.util.HashSet;
import lombok.Getter;
import lombok.Setter;

public class Inscripcion {
    private Alumno alumno;
    private HashSet<Materia> materias;

    public Inscripcion(Alumno alumno, HashSet<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada() {
        return materias.stream().allMatch(materia -> alumno.puedeCursar(materia));
    }
}
