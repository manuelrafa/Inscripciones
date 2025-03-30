package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest extends BaseTest {

    @Test
    public void CumpleSinCorrelativas() {
        assertTrue(ayed.cumpleRequisitos(new HashSet<>()));
    }

    @Test
    public void NoCumpleSinCorrelativas() {
        assertFalse(asi.cumpleRequisitos(new HashSet<>()));
    }

    @Test
    public void CumpleConCorrelativas() {
        assertTrue(asi.cumpleRequisitos(new HashSet<>(Arrays.asList(ayed, sypn))));
    }

    @Test
    public void NoCumpleConCorrelativas() {
        assertFalse(asi.cumpleRequisitos(new HashSet<>(Arrays.asList(adc, asi))));
    }
}