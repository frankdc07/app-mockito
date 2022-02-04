package org.frank.appmockito.ejemplos;

import org.frank.appmockito.ejemplos.models.Examen;

import java.util.Arrays;
import java.util.List;

public class Datos {
    public static final List<Examen> EXAMENES = Arrays.asList(new Examen(5L, "Matematicas"), new Examen(6L, "Español"),
            new Examen(7L, "Historia"));
    public static final List<Examen> EXAMENES_ID_NULL = Arrays.asList(new Examen(null, "Matematicas"), new Examen(null, "Español"),
            new Examen(null, "Historia"));
    public static final List<Examen> EXAMENES_ID_NEGATIVO = Arrays.asList(new Examen(-5L, "Matematicas"), new Examen(-6L, "Español"),
            new Examen(null, "Historia"));
    public static final List<String> PREGUNTAS = Arrays.asList("pregunta 1", "pregunta 2", "pregunta 3", "pregunta 4", "pregunta 5");
    public static final Examen EXAMEN = new Examen(null, "Fisica");
}
