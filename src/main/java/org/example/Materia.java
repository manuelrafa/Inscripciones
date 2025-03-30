package org.example;

import java.util.HashSet;
import lombok.Getter;
import lombok.Setter;

public class Materia {
    private String nombre;
    private HashSet<Materia> correlativas;

    public Materia(String nombre, HashSet<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public boolean cumpleRequisitos(HashSet<Materia> materiasAprobadas) {
        return materiasAprobadas.containsAll(correlativas);
    }
}
