package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BaseTest {
    protected Materia ayed = new Materia("AyED", new HashSet<>());
    protected Materia sypn = new Materia("SyPN", new HashSet<>());
    protected Materia asi = new Materia("ASI", new HashSet<>(Arrays.asList(ayed, sypn)));
    protected Materia adc = new Materia("AdC", new HashSet<>());
    protected Materia ssoo = new Materia("SSOO", new HashSet<>(List.of(adc)));
    protected Materia ingsoc = new Materia("IngSoc", new HashSet<>());
}
