package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest extends BaseTest {

    @Test
    public void Aprueba() {
        HashSet<Materia> materiasAprobadas = new HashSet<>(Arrays.asList(ayed, sypn));
        Alumno alumno = new Alumno("Pepe", "Fernandez", materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion(alumno, new HashSet<>(List.of(asi)));
        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void NoAprueba() {
        HashSet<Materia> materiasAprobadas = new HashSet<>(Arrays.asList(ayed, sypn));
        Alumno alumno = new Alumno("Pepe", "Fernandez", materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion(alumno, new HashSet<>(List.of(ssoo)));
        assertFalse(inscripcion.aprobada());
    }

    @Test
    public void ApruebaVarias() {
        HashSet<Materia> materiasAprobadas = new HashSet<>(Arrays.asList(ayed, sypn, adc));
        Alumno alumno = new Alumno("Pepe", "Fernandez", materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion(alumno, new HashSet<>(List.of(asi, ssoo, ingsoc)));
        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void NoApruebaPorUna() {
        HashSet<Materia> materiasAprobadas = new HashSet<>(Arrays.asList(sypn, adc));
        Alumno alumno = new Alumno("Pepe", "Fernandez", materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion(alumno, new HashSet<>(List.of(asi, ssoo)));
        assertFalse(inscripcion.aprobada());
    }

}