package org.frank.appmockito.ejemplos.repositories;

import org.frank.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
    Examen guardar(Examen examen);
}
